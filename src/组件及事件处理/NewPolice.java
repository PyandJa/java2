/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.event.*;
import javax.swing.*;
/**
 * 该类负责创建相关监视器;
 * 创建监视器的类实现了两个接口：分别是获取焦点的接口和获取键盘的接口
 * @author  qf
 * @date    2021-11-8 0:16:50
 * @version V1.0
 * @desc    
 */
class NewPolice implements KeyListener,FocusListener{

    // 该方法是同时兼顾按下和释放焦点
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    // 当用户按下键盘时，触发该事件
    @Override
    public void keyPressed(KeyEvent e) {
        JTextField t =(JTextField)e.getSource();
        if (t.getCaretPosition()>=6) { //判断插入符号的位置
            t.transferFocus(); // 转移焦点
        }
    }

    // 释放键盘时
    @Override
    public void keyReleased(KeyEvent e) {
      
    }

    // 当无输入焦点变为有输入焦点时，触发该事件
    @Override
    public void focusGained(FocusEvent e) {
        JTextField text = (JTextField)e.getSource();
        text.setText(null);
    }

    // 当输入焦点变为无输入焦点时：
    @Override
    public void focusLost(FocusEvent e) {
       
    }
    
}