/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * 
 * @author  qf
 * @date    2021-11-27 23:07:33
 * @version V1.0
 * @desc    
 */
public class 文件字节输入流 {
    public static void main(String[]args){
        int n=-1;
        byte[]a = new byte[100];
        try{
            File f = new File("D:\\学习任务\\java学习","日语学习.txt"); // 指定输入流的源。
            InputStream in = new FileInputStream(f); // FileInputStream类是InputStream类的子类：创建指向文件gbt.txt的输入流。
            while((n=in.read(a,0,100))!=-1){ // read()：以字节为单位读取源中的数据。返回-1表示已经读取到数据流的最后位置。
                String s = new String(a,0,n); // 把字节转换为字符串。
                System.out.println(s);  
            }
            in.close(); // 关闭流
        }
        catch(IOException e){
            System.out.println("File read Error:"+e);
        }
    }
}