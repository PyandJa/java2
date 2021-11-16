/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * @author  qf
 * @date    2021-11-10 11:36:29
 * @version V1.0
 * @desc    
 */
public class 对话框 {
    public static void main(String[]args){
       WindowMess win = new WindowMess();
       win.setTitle("带消息的对话框");
       win.setBounds(80, 90, 500, 300);
    }
}
class WindowMess extends JFrame implements ActionListener{

    JTextField inputEnglish;
    JTextArea show;
    String regex = "[a-zA-Z]+";

    public WindowMess() throws HeadlessException {
        inputEnglish = new JTextField(22);
        inputEnglish.addActionListener(this); // 注册键盘事件监听器
        show = new JTextArea();
        add(inputEnglish,BorderLayout.NORTH);
        add(show,BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //处理点击事件
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==inputEnglish) {
            String str = inputEnglish.getText(); // 获取内容
            if (str.matches(regex)) { // 判断正则表达式
                show.append(str+","); // 追加形式添加字符
            }
            else{ // 弹出“警告”消息对话框
                JOptionPane.showMessageDialog(this, "您输入了非法字符","消息对话框",JOptionPane.WARNING_MESSAGE);
                                            // 可见位置，消息，标题，外观
                inputEnglish.setText(null);
            }
        }
    }
    
}

