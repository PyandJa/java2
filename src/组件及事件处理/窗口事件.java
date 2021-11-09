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
 * @date    2021-11-8 16:22:37
 * @version V1.0
 * @desc    
 */
public class 窗口事件 {
    public static void main(String[]args){
        new MyFrame("窗口");
    }
}

class MyFrame extends JFrame{
    Boy police;
    public MyFrame(String s) throws HeadlessException {
        super(s); // 1.调用被子类隐藏的关键字或方法 2.调用父类的构造方法
        // 默认为：super() //必须是头一条语句。因为子类没有继承父类的构造方法
        setBounds(100, 100, 200, 300);
        setVisible(true);
        addWindowListener(police); // 向窗口注册监视器
        validate(); // 验证
    }
    
}

/**
 *使用适配器作监视器，只处理窗口关闭事件。
 * 该类继承了适配器WindowAdapter。该适配器已经实现了
 * <p>对应的接口：WindowListener,所以只需重写相关方法即可</p>
 * @author qf
 */
class Boy extends WindowAdapter{
    /**
     * 重写windowClosing方法，只处理窗口关闭事件
     * @param e 
     */
    @Override
    public void windowClosing(WindowEvent e){
        System.out.print("关闭窗口了");
        System.exit(0); // 
    }
}