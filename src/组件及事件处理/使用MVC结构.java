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
 * @date    2021-11-9 23:32:53
 * @version V1.0
 * @desc    
 */
public class 使用MVC结构 {
   public static void main(String[]args){
       WindowTriangle win = new WindowTriangle();
       win.setTitle("计算三角形面积");
       win.setBounds(300, 200, 420, 260);
   } 
    
}

class WindowTriangle extends JFrame implements ActionListener{

    Triangle triangle; // 模型
    JTextField textA,textB,textC; // 视图
    JTextArea showArea; // 视图
    JButton controllButton; // 控制器

    public WindowTriangle() throws HeadlessException {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void init(){
        
        triangle = new Triangle();
        textA = new JTextField(5); // 设置宽度
        textB = new JTextField(5);
        textC = new JTextField(5);
        showArea = new JTextArea(); // 文本区域
        controllButton = new JButton("计算三角形面积");
        
        JPanel pNorth = new JPanel(); // 添加面板
        pNorth.add(new JLabel("边A"));
        pNorth.add(textA);
        pNorth.add(new JLabel("边B"));
        pNorth.add(textB);
        pNorth.add(new JLabel("边C"));
        pNorth.add(textC);
        pNorth.add(controllButton);
        controllButton.addActionListener(this); // 把窗口注册为按钮的监视器，当窗口监视到按钮的Action动作时，就会触发相应的actionPerformed方法。
        add(pNorth,BorderLayout.NORTH);
        add(new JScrollPane(showArea),BorderLayout.CENTER); // 滚动窗格
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(textA.getText().trim()); // 获取去掉空格后的内容
            double b = Double.parseDouble(textB.getText().trim());
            double c = Double.parseDouble(textB.getText().trim());
    // +=====================更新数据=========================+
            triangle.setA(a);
            triangle.setB(b);
            triangle.setC(c);
            String area = triangle.getArea(); // 计算面积
            showArea.append("三角形"+a+","+b+","+c+"的面积");
    // +=====================更新视图=========================+
            showArea.append(area+"\n"); 
                                                    
        } catch (Exception ex) {
            showArea.append("\n"+ex+"\n");
        }
    }
    
}

/**
 * 模型层：Model
 * @author qf
 */
class Triangle{
    
    double sideA,sideB,sideC,area;
    boolean isTriange;
    /**
     * 计算三角形面积的方法
     * @return 三角形面积
     */
    public String getArea(){
        if (isTriange) {
            double p = (sideA+sideB+sideC)/2.0;
            area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
            return String.valueOf(area); // 返回面积
        }
        else{
            return "无法计算面积";
        }
    }
    
    public void setA(double a){
        sideA = a;
        if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) // 任意两条边之和要大于第三边
            isTriange = true;
        else
            isTriange = false;
    }
    
    public void setB(double b){
        sideB = b;
        if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA)
            isTriange = true;
        else
            isTriange = false;
    }
    
    public void setC(double c){
        sideC = c;
        if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA)
            isTriange = true;
        else
            isTriange = false;
    }
}
