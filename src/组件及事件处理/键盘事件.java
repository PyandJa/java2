/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author  qf
 * @date    2021-11-7 23:11:23
 * @version V1.0
 * @desc    
 */
public class 键盘事件 {
    public static void main(String[]args){
        
        NewWin win = new NewWin();
        win.setTitle("输入序列号");
        win.setBounds(600,400,460,360); // 设置边距
        
    }
}

 class NewWin extends JFrame{
    JTextField text[] = new JTextField[3]; // 声明文本域，默认为3个
    NewPolice police; // 声明监视器类
    JButton b;
    int m=10;
     NewWin() { 
         setLayout(new FlowLayout()); // 流式布局
         police = new NewPolice();
        for(int i=0;i<3;i++){
            text[i] = new JTextField(7); // 宽度7
            //text[i].setSize(90, 30);
            m+=100;
            //text[i].setBounds(m, 10, 90, 30);
            text[i].setVisible(true);
            text[i].addKeyListener(police); // 把监视器类注册为监视器
            text[i].addFocusListener(police); 
            add(text[i]);
        }
        b = new JButton("确定");
        add(b);
        text[0].requestFocusInWindow(); // 请求焦点窗口
        setVisible(true); // 显示
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/**
 * 这是一个监视器类
 * @author qf
 */
class NewPolice implements KeyListener,FocusListener{

    // 该方法是同时兼顾按下和释放焦点
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    // 当用户按下键盘时，触发该事件
    @Override
    public void keyPressed(KeyEvent e) {
        JTextField t =(JTextField)e.getSource();
        if (t.getCaretPosition()>=6) { //判断插入符号的位置
            t.transferFocus(); // 转移焦点
        }
    }

    // 释放键盘时
    @Override
    public void keyReleased(KeyEvent e) {
      
    }

    // 当无输入焦点变为有输入焦点时，触发该事件
    @Override
    public void focusGained(FocusEvent e) {
        JTextField text = (JTextField)e.getSource();
        text.setText(null);
    }

    // 当输入焦点变为无输入焦点时：
    @Override
    public void focusLost(FocusEvent e) {
       
    }
    
}


