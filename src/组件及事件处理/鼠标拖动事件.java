/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;


/**
 * @author  qf
 * @date    2021-11-6 22:41:17
 * @version V1.0
 * @desc    
 */
public class 鼠标拖动事件 {
    public static void main(String[]args){
        WindowMove win = new WindowMove();
        win.setTitle("处理鼠标拖动事件");
        win.setBounds(10,10,460,360);
    }
}

class WindowMove extends JFrame{ 
    LP layeredPanLp;
    WindowMove(){
     layeredPanLp = new LP(); // 
     add(layeredPanLp,BorderLayout.CENTER); // 添加控件，并设置布局
        setVisible(true);
        setBounds(12,12,300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置默认关闭操作
    }
}

class LP extends JLayeredPane implements MouseListener,MouseMotionListener{

    JButton button;
    int x,y,a,b,x0,y0;

    public LP() {
        button = new JButton("用鼠标拖动我");
        button.addMouseListener(this);
        button.addMouseMotionListener(this); // 任何组件上都可以发生鼠标事件
        setLayout(new FlowLayout()); // 设置流式布局
        add(button,JLayeredPane.DEFAULT_LAYER);
    }
  
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) { // 鼠标按下时
        JComponent com = null;
        com = (JComponent)e.getSource();
        setLayer(com, JLayeredPane.DRAG_LAYER);
        a = com.getBounds().x;
        b = com.getBounds().y;
        x0 = e.getX(); // 获取鼠标在事件源中的坐标位置。
        y0 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) { // 鼠标释放时
       JComponent com = null;
       com =(JComponent)e.getSource();
       setLayer(com,JLayeredPane.DEFAULT_LAYER);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }

    @Override
    public void mouseDragged(MouseEvent e) { // 鼠标拖动时
        Component com = null;
        if (e.getSource()instanceof Component) {
            a = com.getBounds().x;
            b = com.getBounds().y;
            // 获取鼠标在事件源中的位置坐标
            x = e.getX();
            y = e.getY();
            a = a+x;
            b = b+y;
            com.setLocation(a-x0,b-y0);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       
    }
   
}