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
 * @date    2021-11-19 16:45:38
 * @version V1.0
 * @desc    
 */
public class 打印组件 {
    public static void main(String[]args){
        MyFrame2 f2 = new MyFrame2();
        f2.setBounds(70, 70, 570, 289);
        f2.setVisible(true);
        f2.validate(); // 
    }
}

class MyFrame2 extends JFrame implements ActionListener{

    PrintJob p = null; // 声明打印
    Graphics g = null; // 图形
    JTextArea text = new JTextArea(10,10);
    JButton printTextFied = new JButton("打印文本框"),
            PrintFrame = new JButton("打印窗口"),
            PrintButton = new JButton("打印按钮");

    public MyFrame2() throws HeadlessException {
        super("在应用程序中打印");
        printTextFied.addActionListener(this);
        PrintFrame.addActionListener(this);
        PrintButton.addActionListener(this);
        add(text,"Center"); // 文本框位于中心
        JPanel panel = new JPanel();
        panel.add(printTextFied); // 在控制板上添加控件
        panel.add(PrintFrame);
        panel.add(PrintButton);
        add(panel,"South"); // 面板位于南
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
           if (e.getSource()==printTextFied) {
            p = getToolkit().getPrintJob(this, "ok", null); // 获取打印主键工具包，用于打印当前窗口组件
            g = p.getGraphics(); // p获取一个用于打印的Graphics对象
            g.translate(120, 200);
            text.printAll(g); // 打印当前文本区及其内容
            g.dispose(); // 释放对象g
            p.end();
        }
           else if (e.getSource()==PrintFrame) {
            p = getToolkit().getPrintJob(this, "ok", null); // 获取打印主键工具包，用于打印当前窗口组件
            g = p.getGraphics(); // p获取一个用于打印的Graphics对象
            g.translate(120, 200);
            text.printAll(g); // 打印当前组件及其窗口
            g.dispose(); // 释放对象g
            p.end();
        }
           else if (e.getSource()==PrintButton) {
            p = getToolkit().getPrintJob(this, "ok", null);
            g = p.getGraphics();
            g.translate(120, 200); // 在打印页的坐标(120,200)printTextFied
            printTextFied.printAll(g);
            g.translate(78, 0); // 在打印页的坐标(198,200)PrintFrame
            PrintFrame.printAll(g);
            g.translate(66, 0);
            PrintButton.printAll(g); // 在打印页的坐标(264,200)PrintButton
        }
    }
    
}

