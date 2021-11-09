/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;                                                
import java.awt.event.ItemListener;
import javax.swing.*;


/**
 * 选择框,下拉列表:下拉框事件
 * @author  qf
 * @date    2021-7-27 21:19:28
 * @version V1.0
 * @desc    
 */
public class 下拉框事件 {
    public static void main(String[]args){
        WindowOperation win = new WindowOperation();
        win.setBounds(100, 100, 390, 360);
        win.setTitle("简单计算器");
    }
}
/**
 * 创建简单计算器
 * @author qf
 */
class WindowOperation extends JFrame{
    JTextField inputNumberOne,inputNumberTwo; // 声明两个输入框
    JComboBox choiceFuhao;      // 下拉框
    JTextArea textShow;         // 输出框
    JButton button;             // 按钮
    OperatorListener operator;  // 监视下拉框的监视器
    ComputerListener computer;  // 监视按钮的监视器
    /**
     * 创建视图
     */
    public WindowOperation(){
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * 视图初始化
     */
    void init(){
        setLayout(new FlowLayout());  // 流式布局
        inputNumberOne = new JTextField(5);
        inputNumberTwo = new JTextField(5);
        choiceFuhao = new JComboBox();
        button = new JButton("计算");
        choiceFuhao.addItem("选择符号");
        String[] a ={"+","-","*","/"}; 
        for(int i=0;i<a.length;i++){  // 用循环添加下拉内容
            choiceFuhao.addItem(a[i]);
        }
        textShow = new JTextArea(9, 30);
        operator = new OperatorListener();
        computer = new ComputerListener();
        // 设置控件的监视器
        operator.setJcomboBox(choiceFuhao); 
        operator.setWorkTogether(computer);
        computer.setJTextFieldOne(inputNumberOne);
        computer.setJTextFieldTwo(inputNumberTwo);
        computer.setJTextArea(textShow);
        // 为控件添加相关事件                                                           
        choiceFuhao.addItemListener(operator); // choiceFuhao是事件源.operator是监视器:  
        button.addActionListener(computer);    // button是事件源,computer是监视器
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
        
    }
    
}
/**
 * 重写接口方法,处理下拉框选择事件
 * @author qf
 */
class OperatorListener implements ItemListener{
    
    JComboBox choice;
    ComputerListener workTogether;
    /**
     * 设置下拉控件的监视器
     * @param box 
     */
    public void setJcomboBox(JComboBox box){
        choice = box;
    }
    /**
     * 设置按钮控件的监视器
     * @param computer 
     */
    public void setWorkTogether(ComputerListener computer){
        workTogether=computer;
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
       
        String fuhao = choice.getSelectedItem().toString();
        workTogether.setFuhao(fuhao); // 获取算数符号
    }

}
/**
 * 重写接口方法,处理按钮点击事件
 * @author qf
 */
class ComputerListener implements ActionListener{

    JTextField inputNumberOne,inputNumberTwo;
    JTextArea textShow;
    String fuhao;
    /**
     * 获取第一个数值
     * @param t 
     */
    public void setJTextFieldOne(JTextField t){
        inputNumberOne = t;
    }
    /**
     * 获取第二个数值
     * @param t 
     */
    public void setJTextFieldTwo(JTextField t){
        inputNumberTwo = t;
    }
    /**
     * 获取结果值
     * @param area 
     */
    public void setJTextArea(JTextArea area){
        textShow = area;
    }
    /**
     * 获取算数符合
     * @param s 
     */
    public void setFuhao(String s){
       fuhao = s;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = Double.parseDouble(inputNumberOne.getText());
            double number2 = Double.parseDouble(inputNumberTwo.getText());
            double result = 0;
            switch (fuhao) {
                case "+":
                    result = number1+number2;
                    break;
                case "-":
                    result = number1-number2;
                    break;
                case "*":
                    result = number1*number2;
                    break;
                case "/":
                    result = number1/number2;
                    break;
                default:
                    break;
            }
            inputNumberOne.setText("");
            inputNumberTwo.setText("");
            textShow.append(number1+""+fuhao+""+number2+"="+result+"\n");
        } catch (NumberFormatException exp) {
            textShow.append("\n请输入数字字符"+exp.toString()+"\n");
        }
    }
    
}
