/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * 流的源和目的除了是文件外，还可以是计算机内存
 * @author  qf
 * @date    2021-12-6 11:06:43
 * @version V1.0
 * @desc    
 */
public class 数组流 {
    public static void main(String[]args){
        try {
            //-----------------字节数组流----------------------------
            ByteArrayOutputStream outByte = new ByteArrayOutputStream(); // 字节数组输出流，指定缓冲区默认大小32
            byte[] byteContent = "mid0autumn festival".getBytes(); 
            outByte.write(byteContent); // 顺序的向缓冲区写入一个字节
            
            ByteArrayInputStream inByte = new ByteArrayInputStream(outByte.toByteArray());  // 字节数组输入流
            byte backByte[] = new byte[outByte.toByteArray().length];
            inByte.read(backByte); // 顺序的读取源中的字节
            System.out.println(new String(backByte));
            //-----------------字符数组流----------------------------
            CharArrayWriter outChar = new CharArrayWriter(); // 
            char [] charContent = "中秋快乐".toCharArray(); 
            outChar.write(charContent); 
            
            CharArrayReader inChar = new CharArrayReader(outChar.toCharArray());
            char backChar [] = new char[outChar.toCharArray().length];
            inChar.read(backChar);
            System.out.println(new String(backChar));
            
            
        } catch (Exception e) {
        }
    }
}