/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;
/*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/
/**
 * 利用组合来实现一个对象操作另一个对象
 * @author  qf
 * @date    2021-7-27 15:42:09
 * @version V1.0
 * @desc    
 */
public class ActionEvent组合事件 {
    public static void main(String [] args){
        windowActionEvent win = new windowActionEvent();
        PoliceListen police = new PoliceListen();
        win.setMyCommandListener(police);
        win.setBounds(100, 100, 460, 360);
        win.setTitle("组合实现事件处理");
    }
}
class windowActionEvent extends JFrame{
    JTextField inputText; // 声明文本框
    JTextArea textShow;   // 声明文本显示区
    JButton button;       // 声明按钮
    MyCommandListener listener; // 声明接口
    public windowActionEvent(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * 图像初始化方法
     */
    void init(){
        setLayout(new FlowLayout()); // 流式布局
        inputText = new JTextField(10);
        button = new JButton("确定");
        textShow = new JTextArea(9,30);
        add(inputText);
        add(button);
        add(new JScrollPane(textShow)); // 滚动视图
    }
    /**
     * 用于设置相关控件的监视器
     * @param listener 
     */
    void setMyCommandListener(MyCommandListener listener){
        this.listener = listener;
        listener.setJTextField(inputText);
        listener.setJTextArea(textShow);
        inputText.addActionListener(listener); // inputText是事件源,listener是监视器
        button.addActionListener(listener);    // button是事件源,listnere是监视器
    }
}
/**
 * 该接口，多给出两个方法，用于实现对按钮的处理
 * @author qf
 */
interface MyCommandListener extends ActionListener{
    public void setJTextField(JTextField text);
    public void setJTextArea(JTextArea area);  
}
/**
 * 该类负责创建监视器
 * @author qf
 */
class PoliceListen implements MyCommandListener{
    JTextField textInput;
    JTextArea textShow;
   @Override
    public void setJTextField(JTextField text){
        textInput=text;
    }
    @Override
    public void setJTextArea(JTextArea area){
        textShow=area;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String str = textInput.getText(); // 获取文本框内容
        textShow.append(str+"长度:"+str.length()+"\n"); // 在输出框中显示内容
        textInput.setText("");
    }

}