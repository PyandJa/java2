/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author  qf
 * @date    2021-12-19 23:35:18
 * @version V1.0
 * @desc    
 */
public class 文件锁 {
    public static void main(String[]args){
        File file = new File("D:/学习任务/日语学习/标准日本语初级下册/第26课 日本語を勉強するのは，楽しいです。.txt");
        WindowFileLock win = new WindowFileLock(file);
        win.setTitle("文件锁");
    }
}

class WindowFileLock extends JFrame implements ActionListener{

    JTextArea text;
    JButton button;
    File file;
    RandomAccessFile input;
    FileChannel channel;
    FileLock lock;

    public WindowFileLock(File f) throws HeadlessException {
        file = f;
        try {
            input = new RandomAccessFile(file, "rw");
            channel = input.getChannel();
            lock = channel.tryLock();
        }
        catch (Exception exp) {}
        text = new JTextArea();
        button = new JButton("读取一行");
        button.addActionListener(this);
        add(new JScrollPane(text),BorderLayout.CENTER);
        add(button,BorderLayout.SOUTH);
        setSize(300,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            lock.release();
            String lineString = input.readLine();
            text.append("\n"+lineString);
            lock = channel.tryLock();
            if(lineString==null){
                input.close();
            }
            
        } catch (Exception ee) {}
               
    }
    
}