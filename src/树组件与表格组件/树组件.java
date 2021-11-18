/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 树组件与表格组件;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;

/**
 * @author  qf
 * @date    2021-11-18 17:08:43
 * @version V1.0
 * @desc    
 */
public class 树组件 {
    public static void main(String[]args){
        TreeWin win = new TreeWin();
        win.setTitle("树节点");
    }
}

class TreeWin extends JFrame implements TreeSelectionListener{

    JTree tree; // 根节点对象
    JTextArea showText; // 文本区域对象

    public TreeWin() throws HeadlessException {
        
        // 定义根节点和子节点
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("商品"); // 根节点
        DefaultMutableTreeNode nodeTV = new DefaultMutableTreeNode("电视机类"); // 结点
        DefaultMutableTreeNode nodePhone = new DefaultMutableTreeNode("手机类"); // 结点
        
        DefaultMutableTreeNode tv1 = 
                new DefaultMutableTreeNode(new Goods("长虹电视", 5699)); // 结点
        DefaultMutableTreeNode tv2 =
                new DefaultMutableTreeNode(new Goods("海尔电视", 7832)); // 结点
        DefaultMutableTreeNode phone1 =
                new DefaultMutableTreeNode(new Goods("诺基亚", 3600)); // 结点
        DefaultMutableTreeNode phone2 = 
                new DefaultMutableTreeNode(new Goods("三星手机", 2155)); // 结点
        
        root.add(nodeTV); // 确定结点间的关系
        root.add(nodePhone);
        
        nodeTV.add(tv1); // 确定结点间的关系
        nodeTV.add(tv2);
        
        nodePhone.add(phone1); // 确定结点间的关系
        nodePhone.add(phone2);
        
        tree = new JTree(root); // 用root做根的树组件
        tree.addTreeSelectionListener(this); // 窗口监视树组件上的事情
        
        showText = new JTextArea();
        setLayout(new GridLayout(1,2)); // 布局为网格布局
        add(new JScrollPane(tree));  // 添加滚动条
        add(new JScrollPane(showText)); // 添加滚动条
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 
        setVisible(true);
        setBounds(80,80,300,300);
        validate(); // 验证
    }
     
    @Override
    public void valueChanged(TreeSelectionEvent e) { // 点击结点时
        DefaultMutableTreeNode node =
                (DefaultMutableTreeNode)tree.getLastSelectedPathComponent(); // 选择结点时，获取
        if (node.isLeaf()) { // 判断是否是结点
            Goods s = (Goods)node.getUserObject(); // 获取结点中存在的对象
            showText.append(s.name+","+s.price+"元\n"); // 在文本区域输出内容和价格
        }
        else{
            showText.setText(null);
        }
    }
    
}

class Goods{
    String name;
    double price;
    
    /**
     * 
     * @param n:名称
     * @param p :价格
     */
    public Goods(String n,double p) {
        name = n;
        price = p;
    }
    
    /**
     * 返回对象的字符串表示
     * @return name-名称
     */
    public String toString(){
        return name;
    }   
}



 