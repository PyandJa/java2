/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * 1.DatainputStream和DataOutputStream是很有用的数据输入和输出流
 * 2.可以允许程序按着机器无关的风格读取java原数据
 * @author  qf
 * @date    2021-12-6 11:56:07
 * @version V1.0
 * @desc    
 */
public class 数据流 {
    public static void main(String[]args){
        File file = new File("apple.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            DataOutputStream outData = new DataOutputStream(fos);
            outData.writeInt(100);
            outData.writeLong(123456);
            outData.writeFloat(3.1415926f);
            outData.writeDouble(987654321.1234);
            outData.writeBoolean(true);
            outData.writeChars("How are you doing");
            
        } catch (IOException e) {
            
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream inData = new DataInputStream(fis);
            System.out.println(inData.readInt());    // 读取int数据
            System.out.println(inData.readLong());   // 读取long数据
            System.out.println(inData.readFloat());  // 读取float数据
            System.out.println(inData.readDouble()); // 读取double数据
            System.out.println(inData.readBoolean());// 读取boolean数据
            char c = '\0';  // \0表示空字符
            while ((c=inData.readChar())!=0) { // 当读取到字符时
                System.out.println(c);
                
            }
        } catch (IOException e) {
            
        }
    }
}