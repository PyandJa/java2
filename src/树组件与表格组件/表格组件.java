/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 树组件与表格组件;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author  qf
 * @date    2021-11-18 18:44:56
 * @version V1.0
 * @desc    
 */
public class 表格组件 {
    public static void main(String[]args){
        WinTable win = new WinTable();
        win.setTitle("窗格组件");
        win.setBounds(400, 300, 500, 250);
    }
}

class WinTable extends JFrame implements ActionListener{

    JTable table;
    Object a[][];
    Object name[]={"姓名","英语成绩","数学成绩","总成绩","平均成绩"};
    JButton button;

    public WinTable() throws HeadlessException {
        a = new Object[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (j!=0) {
                    a[i][j]="0"; // 所有成绩初始为0
                }
                else{
                    a[i][j]="姓名"; // 第一列统一为“姓名”
                }
            }           
        }
        button = new JButton("计算每人总成绩");
        table = new JTable(a,name); // 创建表格：a为二维数组的值，name为列名称。
        button.addActionListener(this);
        Container con = getContentPane(); // 返回此框架的内容窗格属性
        getContentPane().add(new JScrollPane(table),BorderLayout.CENTER); // 在框架的内容窗格上加上滚动条表格，并设置边框布局:中央
        con.add(new JLabel("修改或录入数据后,请按回车确认！"),BorderLayout.SOUTH); // 边框布局:南
        con.add(button,BorderLayout.SOUTH);
        setSize(200,200);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
     
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 8; i++) {
            double sum = 0;
            boolean boo = true;
            for (int j = 1; j <=2; j++) {
                try {
                    sum=sum+Double.parseDouble(a[i][j].toString()); // toString会返回Object对象的字符串表示，所以就会获取表格里的内容。
                } catch (Exception ee) {
                    boo=false; // 报错时
                    table.repaint();// 刷新表格
                }
                if (boo==true) { // 计算成绩
                    a[i][3]=" "+sum;
                    a[i][4]=""+sum/2;
                    table.repaint();
                }
            }
        }
    }
    
}


