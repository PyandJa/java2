/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author  qf
 * @date    2021-11-19 13:22:20
 * @version V1.0
 * @desc    
 */
public class 按钮绑定到键盘 {
    public static void main(String[]args){
        BindButtonWindow win = new BindButtonWindow();
        win.setTitle("键盘绑定到按钮");
        win.setBounds(100, 100, 300, 200);
    }
}

class BindButtonWindow extends JFrame{
    JButton button;
    Police listener;
    
    public BindButtonWindow() throws HeadlessException {
        setLayout(new FlowLayout());
        listener = new Police();
        button = new JButton("单机或按'A'键移动我");
        add(button);
        button.addActionListener(listener); // 监视鼠标单机按钮
        //--------------分为4个步骤------------
        InputMap inputmap = button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW); // 1.输入映射,当组件具有焦点时
        inputmap.put(KeyStroke.getKeyStroke("A"),"dog"); // 2.将按钮的键盘操作映射到指定键上，并指定Object类型的映射关键字。
        ActionMap actionmap = button.getActionMap(); // 3.获取按钮上的操作映射
        actionmap.put("dog", listener);  // 4.为按钮的键盘操作指定监视器,通过映射关键字指定到对应操作键,实现按键时通知监视器的过程
        setVisible(true);
        setBounds(100, 100, 200, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
   
 /**
 * 内部类该类为继承了键盘事件的子类
 * @author qf
 */
   class Police extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource(); // 获取组件
        int x=b.getX(); // 获取按钮横轴位置
        int y=b.getY(); // 获取按钮纵轴位置
        b.setLocation(x+10,y+10); // 移动组件
       }  
    }
    
}


