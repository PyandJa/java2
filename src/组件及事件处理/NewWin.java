/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.*;
import javax.swing.*;

/**
 * @author  qf
 * @date    2021-11-8 0:21:12
 * @version V1.0
 * @desc    
 */
public class NewWin extends JFrame{
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
            text[i].addKeyListener(police); // 注册监视键盘事件
            text[i].addFocusListener(police); // 注册监视焦点事件
            add(text[i]);
        }
        b = new JButton("确定");
        add(b);
        text[0].requestFocusInWindow(); // 请求焦点窗口
        setVisible(true); // 显示
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}