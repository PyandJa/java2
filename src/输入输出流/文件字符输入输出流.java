/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * @author  qf
 * @date    2021-11-28 23:34:09
 * @version V1.0
 * @desc    
 */
public class 文件字符输入输出流 {
    public static void main(String[]args){
        
        File sourceFile = new File("a.txt"); // 读取的文件
        File targetFile = new File("b.txt"); // 写入的文件
        char c[] = new char[19]; // char型数组
        try {
            Writer out = new FileWriter(targetFile,true); // 指向目的地的输出流
            Reader in = new FileReader(sourceFile); // 指向源的输入流
            int n = -1;
            while ((n=in.read(c))!=-1) { // 把源的内容读出，放入到char型数组中
                 out.write(c,0,n); // 把char数组内容写入目的地          
            }
            out.flush(); // 立刻冲洗当前缓冲区，不必等到缓冲区溢出时
            out.close();
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }
}

