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
 * @date    2021-11-18 15:36:17
 * @version V1.0
 * @desc    
 */
public class 自定义对话框 {
    public static void main(String[]args){
        MyWindow win = new MyWindow();
        win.setTitle("带自定义一对话框的窗口");
        win.setSize(200,300);
    }
}

class MyWindow extends JFrame implements ActionListener{
    JButton button;
    MyDialog dialog;
    public MyWindow() throws HeadlessException {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void init(){
        button = new JButton("打开对话框");
        button.addActionListener(this); // 注册监视器
        add(button,BorderLayout.NORTH); // 边框布局
        dialog = new MyDialog(this, "我是对话框"); // 对话框依赖于MyWindow
        dialog.setModal(true); // 有模式的对话框      
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        dialog.setVisible(true); // 自定义窗口变为可见
        String str = dialog.getTitle(); // 获取自定义对话框标题
        setTitle(str); // 设置窗口标题
    }
    
}

/**
 * 继承JDialog的子类用于创建对话框
 * <li>该子类可以像窗口一样，添加自定义组件；但是不能把对话框添加在另一个容器中。
 * @author qf
 */
class MyDialog extends JDialog implements ActionListener{

    JTextField inputTitle;
    String title;

    public MyDialog(JFrame f,String s) {
        super(f,s);
        inputTitle = new JTextField(10);
        inputTitle.addActionListener(this);
        setLayout(new FlowLayout());
        add(new JLabel("输入窗口的新标题"));
        add(inputTitle);
        setBounds(60,60,100,100);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
      
    @Override
    public void actionPerformed(ActionEvent e) {
       title = inputTitle.getText();  
        setVisible(false);
    }
    /**
     * 获取标题
     * @return title-返回标题内容
     */
    public String getTitle(){
        return title;
    }
    
}