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
public class 常用组件与布局 {
    public static void main(String[]args){
        ComponentInWindow win = new ComponentInWindow();
        win.setBounds(100,100,450,260); // 移动并调整此组件的大小。
        win.setTitle("常用组件"); // 获取框架的标题。
    }
    
}
class ComponentInWindow extends JFrame{
    JCheckBox checkbox1,checkbox2; // 复选框
    JRadioButton radioM,radioF; // 单选框
    ButtonGroup group; // 按钮
    JComboBox<String> comboBox; // 下拉列表
    public ComponentInWindow(){
        init();
        setVisible(Boolean.TRUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        // 属性设置
        setLayout(new FlowLayout()); // 设置布局:流式布局
        comboBox = new JComboBox<String>();
        checkbox1 = new JCheckBox("喜欢音乐");
        checkbox2 = new JCheckBox("喜欢旅游");
        group = new ButtonGroup(); // 组
        radioM = new JRadioButton("男");
        radioF = new JRadioButton("女");
        
        group.add(radioM); // 归为一组才能实现单选
        group.add(radioF); // 归为一组才能实现单选
        // 添加操作
        add(checkbox1);
        add(checkbox2);
        add(radioM);
        add(radioF);
        comboBox.addItem("音乐天地");
        comboBox.addItem("武术天地");
        add(comboBox);
    }
}