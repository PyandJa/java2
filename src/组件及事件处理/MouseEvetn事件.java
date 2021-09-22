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
public class MouseEvetn事件 {
    public static void main(String[] args) {
        
    }
}

 class WindowMouse extends JFrame{
    JTextField text;
    JButton button;
    JTextArea textArea;
    MousePolice police;

    public WindowMouse() throws HeadlessException {
        
    }
    
}

class MousePolice implements MouseListener{

    JTextArea area;
    public void setJTextArea(JTextArea area){
        this.area=area;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 鼠标按下时
     * @param e 
     */
    @Override
    public void mousePressed(MouseEvent e) {
        area.append("\n 鼠标按下，位置："+"("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        area.append("\n 鼠标释放，位置："+"("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() instanceof JButton)
           area.append("\n 鼠标进入按钮，位置："+"("+e.getX()+","+e.getY()+")");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
}
