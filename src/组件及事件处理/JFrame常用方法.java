/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.*;
import static javax.swing.JFrame.*;


/**
 * 该类为底层容器类
 * @author  qf
 * @date    2021-7-22 14:55:34
 * @version V1.0
 * @desc    
 */
public class JFrame常用方法 {
    public static void main(String[]args){
        // 创建窗口：
        JFrame window1 = new JFrame("Java的第一个窗口");            // 创建窗口对象
        Container con = window1.getContentPane();   // 容器对象赋值
        //con.setBackground(Color.DARK_GRAY);       // 设置背景颜色
        window1.setBounds(800, 600, 600, 400);      // 左边 顶部 宽度 高度
        window1.setVisible(false);   // 窗口可见,默认不可见
        window1.setResizable(true); // 窗口可以调整大小，默认不允许
        window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 点击关闭图标后的操作,由常量指定
        
        // 菜单和子菜单：
        WindowMenu win = new WindowMenu("带菜单系统",200,300,600,400);
    }
}
/**
 * 创建自定义窗口布局
 * @author qf
 */
class WindowMenu extends JFrame{
    JMenuBar menubar;       // 声明菜单条对象
    JMenu menu,subMenu;     // 声明菜单对象
    JMenuItem item1,item2;  // 声明菜单项
    public WindowMenu(){}  // 无参
    public WindowMenu(String s,int x,int y,int w,int h){
        init(s);
        setLocation(x,y);
        setSize(w, h);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); // 不执行如何操作
    }
    /**
     * 初始化窗口布局
     * @param s 
     */
    void init(String s){
        setTitle(s);  // 设置头
        menubar = new JMenuBar();
        menu = new JMenu("菜单");
        subMenu = new JMenu("软件项目");
        item1 = new JMenuItem("Java话题");
        item2 = new JMenuItem("动画话题");
        item1.setAccelerator(KeyStroke.getKeyStroke('A')); // 按下A建
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK)); // 按下ctrl+s
        menu.add(item1);
        menu.addSeparator(); // 添加分隔符
        menu.add(item2);
        menu.add(subMenu); // 菜单嵌套        
        subMenu.add(new JMenuItem("汽车销售系统")); // 嵌套菜单的内容
        subMenu.add(new JMenuItem("农场系统")); 
        menubar.add(menu); // 菜单添加到菜单条
        setJMenuBar(menubar); // 设置菜单栏,将菜单放在框中
        
    }
    
}