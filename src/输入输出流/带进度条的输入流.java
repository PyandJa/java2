/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import javax.swing.*;
import java.io.*;
/**
 * @author  qf
 * @date    2021-12-19 23:23:42
 * @version V1.0
 * @desc    
 */
public class 带进度条的输入流 {
    public static void main(String[]args){
        byte [] b = new byte[30];
        try {
            FileInputStream input = new FileInputStream("D:/学习任务/日语学习/标准日本语初级下册/第26课 日本語を勉強するのは，楽しいです。.txt");
            ProgressMonitorInputStream in = new ProgressMonitorInputStream(null, "读取日语资料", input); // 实列化进度条对象
            while((in.read(b))!=-1){
                String s = new String(b);
                System.out.println(s);
                Thread.sleep(1000); // 由于文件较小，为了看清进度条，这里有意延长1000毫秒。
            }
        } catch (Exception e) {
        }
    }
}