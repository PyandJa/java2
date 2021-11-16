/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 * @author  qf
 * @date    2021-11-16 23:22:51
 * @version V1.0
 * @desc    
 */
public class 输入对话框 {
    public static void main(String args[]){
        WindowInput win = new WindowInput();
        win.setTitle("输入对话框");
        win.setBounds(80, 90, 400, 300);
    }
}
 class WindowInput extends JFrame implements ActionListener{

    JTextArea showResult;
    JButton openInput;

    public WindowInput() throws HeadlessException {
        openInput = new JButton("弹出输入对话框");
        showResult = new JTextArea();
        add(openInput,BorderLayout.NORTH);
        add(new JScrollPane(showResult),BorderLayout.CENTER);
        openInput.addActionListener(this); // 注册监听器
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // 少了对控件事件的判断
       String str = JOptionPane.showInputDialog(this,"输入数字，必须用空格分隔","输入对话框",JOptionPane.PLAIN_MESSAGE); // 弹出输入对话框
        if (str!=null) {
            Scanner scanner = new Scanner(str); // 获取输入流
            double sum = 0;
            int k = 0;
            while (scanner.hasNext()) { // 还有数据流时
                try {
                    double number = scanner.nextDouble(); // 读取scanner对象里的数据流并转置为双精度
                    if (k==0) {
                        showResult.append(""+number); // 追加进入文本区域
                    }
                    else{
                        showResult.append("+"+number);// 追加进入文本区域
                    }
                    sum = sum+number; // 累加器
                    k++;
                } catch (InputMismatchException exp) {
                    String t = scanner.next();
                }
                
            }
            showResult.append("="+sum+"\n"); // 输出
        }
    }

}