/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * @author  qf
 * @date    2021-11-28 22:56:11
 * @version V1.0
 * @desc    
 */
public class 文件输出流 {
    public static void main(String[]args){
        byte [] a ="新年快乐".getBytes();
        byte [] b ="Happy New Year".getBytes();
        File file = new File("a.txt"); // 输出的目的地。
        try{
            //------------第一种写法-------------
            OutputStream out = new FileOutputStream(file); // 指向目的地的输出流
            System.out.println(file.getName()+"大小:"+file.length()+"字节"); // a.txt的大小：0字节           
            out.write(a); // 向目的地写入数据
            out.close();
            //------------第二种写法-------------
            out = new FileOutputStream(file,true); // 准备向文件尾加内容。
            System.out.println(file.getName()+"大小："+file.length()+"字节"); //   
            out.write(b,0,b.length);
            System.out.println(file.getName()+"的大小："+file.length()+"字节"); // 
            out.close();
        }
        catch(IOException e){
            System.out.println("Error:"+e);
        }
    }
}