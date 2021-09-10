/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;


/**
 * @author  qf
 * @date    2021-9-10 20:24:47
 * @version V1.0
 * @desc    
 */
public class DocumentEvent事件 {
    public static void main(String[]args){
        WindowDocument win = new WindowDocument();
        win.setBounds(100,100,590,500);
        win.setTitle("排序单词");
    }
}
/**
 * 该类负责创建窗口
 * @author qf
 */
class WindowDocument extends JFrame{
    JTextArea inputText,showText;
    JMenuBar menuber;
    JMenu menu;
    JMenuItem itemCopy,itemCut,itemPaste;
    TextListener textChangeListener; //inputText的监视器 
    HandleListener handleListener; // itemCopy,itemCut,itemPaste的监视器
    WindowDocument(){
        init();
        setLayout(new FlowLayout());// 自动排版
        setVisible(true);// 显示
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置点击关闭按钮的操作
    }
    /**
     * 初始化界面
     */
    void init(){
        inputText=new JTextArea(15,20);
        showText=new JTextArea(15, 20);
        showText.setLineWrap(true);// 文本自动回车换行
        showText.setWrapStyleWord(true);// 文本区以单词为界自动换行
        menuber = new JMenuBar();
        menu = new JMenu("编辑");
        itemCopy = new JMenuItem("复制(C)");
        itemCut = new JMenuItem("剪切(T)");
        itemPaste = new JMenuItem("粘贴(P)");
        itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));//设置快捷方式
        itemCut.setAccelerator(KeyStroke.getKeyStroke('t'));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke('p'));
        itemCopy.setActionCommand("copy");
        itemCut.setActionCommand("cut");
        itemPaste.setActionCommand("paste");
        menu.add(itemCopy);
        menu.add(itemCut);
        menu.add(itemPaste);
        menuber.add(menu);
        add(new JScrollPane(inputText));
        add(new JScrollPane(showText));
        textChangeListener = new TextListener();
        handleListener = new HandleListener();
        textChangeListener.setInputText(inputText);
        textChangeListener.setshowText(showText);
        handleListener.setinputText(inputText);
        handleListener.setShowText(showText);
        (inputText.getDocument()).addDocumentListener(textChangeListener);// 向文档注册监视器
        itemCopy.addActionListener(handleListener);// 向菜单项注册监视器
        itemCut.addActionListener(handleListener);
        itemPaste.addActionListener(handleListener);
    }
}
/**
 * 该类负责创建触发DocumentEvent事件的监视器
 * @author qf
 */
class TextListener implements DocumentListener{
    JTextArea inputTextArea,showText;
    public void setInputText(JTextArea text){
        inputTextArea=text;       
    }
    public void setshowText(JTextArea text){
        showText=text;
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        String str=inputTextArea.getText();
        // 空格、数字和字符(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式
        String regex="[\\s\\d\\p{Punct}]+";
        String words[]=str.split(regex);
        Arrays.sort(words); // 按字典序从大到小排序
        showText.setText(null);
        for (int i = 0; i < words.length; i++) {
            showText.append(words[i]+",");         
        }
    }
    
}

/**
 * 该类负责创建触发ActionEvent事件的监视器
 * @author qf
 */
class HandleListener implements ActionListener{   
    JTextArea inpuText,showText;
    public void setinputText(JTextArea text){
        inpuText=text;
    }
    
    public void setShowText(JTextArea text){
        showText=text;
    } 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String str=e.getActionCommand();
        if(str.equals("copy"))
            showText.copy();
        else if(str.equals("cut"))
            showText.cut();
        else if(str.equals("paste"))
            inpuText.paste();
    } 
}