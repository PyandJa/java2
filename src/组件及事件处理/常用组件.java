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
 * @date    2021-7-22 20:03:33
 * @version V1.0
 * @desc    
 */
public class 常用组件 {
    public static void main(String[]args){
        ComponentInWindow win = new ComponentInWindow();
        win.setBounds(100,100,600,260); // 移动并调整此组件的大小。
        win.setTitle("常用组件"); // 获取框架的标题。
        
    }
    
}
/**
 * 这是自己创建的布局类
 * @author qf
 */
class ComponentInWindow extends JFrame{
    JCheckBox checkbox1,checkbox2; // 复选框
    JRadioButton radioM,radioF; // 单选框
    ButtonGroup group; // 按钮
    JComboBox<String> comboBox; // 下拉列表
    JPasswordField pssowrd; // 密码框
    /**
     * 该构造方法调用直接父类和间接父类进行窗体格式化操作
     */
    public ComponentInWindow(){
        init();
        setVisible(Boolean.TRUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    /**
     * 该方法用于初始化窗口的组件及布局
     */
    void init(){
        // 属性设置
        setLayout(new FlowLayout()); // 设置流式布局,默认布局
        JLabel lb1; // 文本标签
        comboBox = new JComboBox<>(); // 使用菱形推断
        checkbox1 = new JCheckBox("喜欢音乐");
        checkbox2 = new JCheckBox("喜欢旅游");
        group = new ButtonGroup(); // 组
        radioM = new JRadioButton("男",true); // 默认选中
        radioF = new JRadioButton("女");
        pssowrd = new JPasswordField(); // 创建密码框对象
        pssowrd.setEchoChar('*'); // 从新设置回字符
        pssowrd.setColumns(10); // 设置文本框长度
        lb1 = new JLabel("密码:");
        group.add(radioM); // 归为一组才能实现单选
        group.add(radioF); // 归为一组才能实现单选
        // 添加操作：按照添加顺序显示流式布局：
        add(checkbox1);
        add(checkbox2);
        add(radioM);
        add(radioF);
        comboBox.addItem("音乐天地"); // 添加下拉列表的内容
        comboBox.addItem("武术天地");
        add(comboBox);
        add(lb1);
        add(pssowrd);
        
    }
}
