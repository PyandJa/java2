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
 * @date    2021-11-17 18:23:52
 * @version V1.0
 * @desc    
 */
public class 颜色对话框 {
    public static void main(String[]args){
        WindowColor win = new WindowColor();
        win.setTitle("带颜色的对话框窗口");
        win.setBounds(80, 90, 400, 300);
    }
}

class WindowColor extends JFrame implements ActionListener{

    JButton button;

    public WindowColor() throws HeadlessException {
        button = new JButton("打开颜色对话框");
        button.addActionListener(this);
        setLayout(new FlowLayout());
        add(button);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
       Color newColor = JColorChooser.showDialog(this, "调色板", getContentPane().getBackground()); // 把内容窗格的颜色定位初始颜色
       
        if (newColor!=null) {
            getContentPane().setBackground(newColor); // 调色赋值给内容窗格
        }
       
    }
    
}