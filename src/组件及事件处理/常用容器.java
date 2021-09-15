/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 组件及事件处理;

import java.awt.*;
import javax.swing.*;

/**
 * @author qf
 * @date 2021-7-22 21:12:15
 * @version V1.0
 * @desc
 */
public class 常用容器 {
    public static void main(String[] args) {
        // new ShowLayout();
        WindowBoxLayout win = new WindowBoxLayout();
        win.setBounds(100, 100, 310, 260);
        win.setTitle("嵌套盒式布局容器");
    }
}

/**
 * 对布局进行初始化类
 * 
 * @author qf
 */
class ShowLayout extends JFrame {
    PanelGrideLayout pannelGrideLayout; // 网格布局
    PanelNullLayout panelNull; // 空格布局
    JTabbedPane p; // 选项卡窗格

    public ShowLayout() throws HeadlessException {
        pannelGrideLayout = new PanelGrideLayout();
        panelNull = new PanelNullLayout();
        p = new JTabbedPane();
        p.add("网格布局的面板", pannelGrideLayout);
        p.add("空布局的面板", panelNull);
        add(p, BorderLayout.CENTER); // 1选项卡
        add(new JButton("窗体是BorderLayout布局"), BorderLayout.NORTH); // 1窗体
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("西"), BorderLayout.WEST);
        add(new JButton("东"), BorderLayout.EAST);
        setBounds(10, 10, 570, 390);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        validate(); // 验证容器--详见java8api
    }

}

/**
 * 自定义面板网格布局类
 * 
 * @author qf
 */
class PanelGrideLayout extends JPanel {

    public PanelGrideLayout() {
        // GridLayout grid = new GridLayout(12, 12); // 网格布局
        setLayout(new GridLayout(12, 12)); // 设置网格布局
        Label label[][] = new Label[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                label[i][j] = new Label();
                if ((i + j) % 2 == 0)
                    label[i][j].setBackground(Color.black);
                else
                    label[i][j].setBackground(Color.white);
                add(label[i][j]);
            }
        }
    }
}

/**
 * 自定义面板空布局类
 * 
 * @author qf
 */
class PanelNullLayout extends JPanel {
    JButton button; // 按钮
    JTextField text; // 文本输入框

    public PanelNullLayout() {
        setLayout(null); // 设置空布局
        button = new JButton("确定");
        text = new JTextField();
        add(text);
        add(button);
        // 空布局需要设置属性
        text.setBounds(100, 30, 90, 30);
        button.setBounds(190, 30, 66, 30);
    }

}

/**
 * 自定义面板盒式布局类
 * 
 * @author qf
 */
class WindowBoxLayout extends JFrame {
    Box boxH; // 行式盒
    Box boxVOne, boxVTwo; // 列式盒

    public WindowBoxLayout() throws HeadlessException {
        setLayout(new FlowLayout());
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    /**
     * 初始化方法
     */
    void init() {
        boxH = Box.createHorizontalBox();
        boxVOne = Box.createVerticalBox();
        boxVTwo = Box.createVerticalBox();
        boxVOne.add(new JLabel("姓名："));
        boxVOne.add(new JLabel("职业："));
        boxVTwo.add(new JTextField(10));
        boxVTwo.add(new JTextField(10));
        boxH.add(boxVOne);
        boxH.add(Box.createHorizontalStrut(10));
        boxH.add(boxVTwo);
        add(boxH);
    }

}