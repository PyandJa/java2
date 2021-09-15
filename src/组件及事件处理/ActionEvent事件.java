/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * 文本框,按钮,菜单项,密码框,单选按钮:ActionEvent事件的处理
 * 
 * @author qf
 * @date 2021-7-25 11:00:06
 * @version V1.0
 * @desc
 */
public class ActionEvent事件 {
    public static void main(String[] args) {
        WindowActionEvent Win = new WindowActionEvent();
        Win.setTitle("处理ActionEvent事件");
        Win.setBounds(100, 100, 310, 260);
    }
}

class WindowActionEvent extends JFrame {
    JTextField text; // 声明文本输入框
    ActionListener listener; // 声明监视器

    public WindowActionEvent() {
        setLayout(new FlowLayout()); // 流式布局
        text = new JTextField(10); // 初始化宽度
        add(text);
        listener = new ReaderListen(); // 创建监视器
        text.addActionListener(listener); // text将listener注册为自己的监视器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

/**
 * 自定义类必须实现指定接口
 * 
 * @author qf
 */
class ReaderListen implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        String str = e.getActionCommand(); // 获取封装在事件中的"命令"字符
        Object obj = e.getSource(); // 获取上转型对象的引用,来自Event
        int s = e.getModifiers(); // 获取按下的键盘id
        System.out.println("输入:" + str + "  长度:" + str.length() + "   按下的键:" + s); // 对于文本框来说，默认字符是文本框的文本

    }
}