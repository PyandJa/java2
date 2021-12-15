/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.*;
import java.io.*;

/**
 * @author  qf
 * @date    2021-12-15 22:58:05
 * @version V1.0
 * @desc    
 */
public class 文件对话框 {
    public static void main(String[]args){
        WindowReader win = new WindowReader();
        win.setTitle("使用文件对话框读写文件");
    }
}

class WindowReader extends JFrame implements ActionListener{

    JFileChooser fileDialog;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem itemSave,itemOpen;
    JTextArea text;
    BufferedReader in;
    FileReader fileReader;
    BufferedWriter out;
    FileWriter fileWriter;
    WindowReader(){
        init();
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init(){
        text = new JTextArea(10,10);
        text.setFont(new Font("楷体_gb2312",Font.PLAIN,28));
        add(new JScrollPane(text),BorderLayout.CENTER);
        menubar = new JMenuBar();
        menu = new JMenu("文件");
        itemSave = new JMenuItem("保存文件");
        itemOpen = new JMenuItem("打开文件");
        itemSave.addActionListener(this);
        itemOpen.addActionListener(this);
        menu.add(itemSave);
        menu.add(itemOpen);
        menubar.add(menu);
        setJMenuBar(menubar);
        fileDialog = new JFileChooser(); // 文件对话框
        FileNameExtensionFilter fileter  = new FileNameExtensionFilter("java文件","java");
        fileDialog.setFileFilter(fileter);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==itemSave) {
            int state  = fileDialog.showSaveDialog(this);
            if (state==JFileChooser.APPROVE_OPTION) {
                try {
                    File dir = fileDialog.getCurrentDirectory();
                    String name = fileDialog.getSelectedFile().getName(); // 获取文件目录名称
                    File file = new File(dir,name); // 指向指定目录
                    fileWriter = new FileWriter(file);
                    out = new BufferedWriter(fileWriter);
                    out.write(text.getText());
                    out.close();
                    fileWriter.close();
                }
                catch (IOException exp) {}                               
            }
        }
            else if(e.getSource()==itemOpen){
                int  state = fileDialog.showOpenDialog(this);
                if (state==JFileChooser.APPROVE_OPTION) {
                    text.setText(null);
                    try {
                        File dir = fileDialog.getCurrentDirectory();
                        String name = fileDialog.getSelectedFile().getName();
                        File file = new File(dir,name);
                        fileReader = new FileReader(file);
                        in = new BufferedReader(fileReader);
                        String s = null;
                        while ((s=in.readLine())!=null) {
                            text.append(s+"\n");  
//                            System.out.println("yell");
                        }
                        in.close();
                        fileReader.close();
                    } 
                    catch (IOException exp) {}                   
                }
            }
        }
    }   