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
 * @date    2021-9-22 20:13:41
 * @version V1.0
 * @desc    这是用于描述组件鼠标事件的类
 */
public class 获取鼠标坐标事件 {
    public static void main(String[] args) {
        WindowMouse win=new WindowMouse();
        win.setTitle("处理鼠标事件");
        win.setBounds(100,100,460,360); // 
    }
}
/**
 * 初始化窗口
 * @author qf
 */
 class WindowMouse extends JFrame{
    JTextField text;
    JButton button;
    JTextArea textArea;
    MousePolice police;

    public WindowMouse() throws HeadlessException {
          init();
          setVisible(true);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * 初始化方法
     */
    void init(){
        setLayout(new FlowLayout());
        text = new JTextField(8);
        button = new JButton("按钮");
        textArea = new JTextArea(5,28);
        police = new MousePolice();
        police.setJTextArea(textArea);
        text.addMouseListener(police);
        add(button);
        add(text);
        add(new JScrollPane(textArea));
    }
}

class MousePolice implements MouseListener{

    JTextArea area;
    public void setJTextArea(JTextArea area){
        this.area=area;
    }

    
    /*
    鼠标连击时
    */
    public MousePolice() {
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        area.append("\n 鼠标连击，位置:"+"("+e.getX()+","+e.getY()+")");
    }

    /**
     * 鼠标按下时
     * @param e 
     */
    @Override
    public void mousePressed(MouseEvent e) {
        area.append("\n 鼠标按下，位置："+"("+e.getX()+","+e.getY()+")");
    }
    /**
     * 鼠标释时
     * @param e 
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        area.append("\n 鼠标释放，位置："+"("+e.getX()+","+e.getY()+")");
    }

    /**
     * 鼠标进入组件时
     * @param e 
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton)
           area.append("\n 鼠标进入按钮，位置："+"("+e.getX()+","+e.getY()+")");
        if (e.getSource() instanceof  JTextField)
           area.append("\n 鼠标进入文本框，位置:"+"("+e.getX()+","+e.getY()+")");
        if(e.getSource() instanceof JFrame)
           area.append("\n 鼠标进入窗口，位置:"+"("+e.getX()+","+e.getY()+")");
    }

    /**
     * 鼠标单机退出时
     * @param e 
     */
    @Override
    public void mouseExited(MouseEvent e) {
        area.append("\n 鼠标退出，位置:"+"("+e.getX()+","+e.getY()+")");
    }
    
        
}
