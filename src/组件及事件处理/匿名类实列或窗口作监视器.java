/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author  qf
 * @date    2021-11-8 17:28:03
 * @version V1.0
 * @desc    
 */
public class 匿名类实列或窗口作监视器 {
    public static void main(String[]args){
        new WindowButton("猜数字游戏");
        
    }
}

class WindowButton extends JFrame implements ActionListener{ // 动作监听接口
    
    int number;
    JLabel hintLabel;
    JTextField inputGuess;
    JButton buttonGetNumber,buttonEnter;

    public WindowButton(String s) throws HeadlessException {
        super(s); // 调用父类的构造函数构建窗体
        addWindowListener(new WindowAdapter() {     //利用窗口适配器作匿名类
        public void windowClosing(WindowEvent e){ // 重写适配器上的方法
            System.out.println("程序正在关闭...");
            dispose(); // 释放资源
         }    
       });
        
        setLayout(new FlowLayout());
        buttonGetNumber = new JButton("获取一个随机数");
        add(buttonGetNumber);
        hintLabel = new JLabel("输入您的猜测:",JLabel.CENTER);
        hintLabel.setBackground(Color.cyan); // 设置背景色
        inputGuess = new JTextField("0",10); // 设置输入框
        add(hintLabel);
        add(inputGuess);
        buttonEnter = new JButton("确定");
        add(buttonEnter);
        
        buttonEnter.addActionListener(this); // 注册监视器,因为组件位于窗口之中
        buttonGetNumber.addActionListener(this);
        setBounds(100,100,150,150);
        setVisible(true);
        validate();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== buttonGetNumber) { // 判断组件动作
            number = (int)(Math.random()*100)+1; // 产生随机数
            hintLabel.setText("输入你的猜测");
        }
        else if (e.getSource()==buttonEnter) { // 判断组件动作
            int guess = 0;
            try {
                guess = Integer.parseInt(inputGuess.getText()); // 获取输入框的内容
                if (guess == number) { // 判断
                    hintLabel.setText("猜对了!");
                }
                else if (guess > number) {
                    hintLabel.setText("猜大了！");
                    inputGuess.setText(null); // 清空文本框
                }
                else{
                    hintLabel.setText("猜小了！");
                    inputGuess.setText(null); // 清空文本框
                }
                
            } catch (NumberFormatException event) { // 数字格式异常
                hintLabel.setText("请输入符合数字的字符");
            }
        }
    }  
}


