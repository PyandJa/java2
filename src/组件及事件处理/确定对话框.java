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
 * @date    2021-11-17 12:20:04
 * @version V1.0
 * @desc    
 */
public class 确定对话框 {
    public static void main(String[]args){
        WindowEnter wn = new WindowEnter();
        wn.setTitle("确定对话框");
        wn.setBounds(80, 90, 400, 300);
    }
}

class WindowEnter extends JFrame implements ActionListener{

    JTextField inputName;
    JTextArea save;
    
    @Deprecated // 面向切面编程:表示已弃用
    public static final int SHUTTTCS = 0;

    public WindowEnter() throws HeadlessException {
        
        inputName = new JTextField(22); // 创建输入框
        inputName.addActionListener(this); // 注册监视器
        save = new JTextArea(); // 创建文本区域
        add(inputName,BorderLayout.NORTH);
        add(new JScrollPane(save),BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String s = inputName.getText(); // 获取输入框内容
        int n = JOptionPane.showConfirmDialog(this, "确认是否正确", "确认对话框", JOptionPane.YES_NO_OPTION);
        
        // 判断点击了确定
        if (n==JOptionPane.YES_OPTION) {
            save.append("\n"+s);
        }
        else if (n==JOptionPane.NO_OPTION) {
            inputName.setText(null);
        }
        
    }
    
}
