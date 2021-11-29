/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;
import java.util.*;

/**
 * 1.BufferedReader 和 BufferedWriter类创建的对象称为缓冲输入流、输出流。
2.二者增强了对文件的读取能力，可以每次读取一行数据，二FileReader类没有提供读取一行的方法。
3.二者的构造方法分别是：BufferedReader(Reader in)和 BufferedWriter(Writer out)
4.BufferedWriter有一个独特的写入回车符的方法：newLine()
 * @author  qf
 * @date    2021-11-28 23:53:05
 * @version V1.0
 * @desc    
 */
public class 缓冲流 {
    public static void main(String[]args){
        File fRead = new File("english.txt");
        File fWrite = new File("englishCount.txt");
        try {
            Writer out = new FileWriter(fWrite);
            BufferedWriter bufferWrite = new BufferedWriter(out);
            Reader in = new FileReader(fRead);
            BufferedReader bufferRead = new BufferedReader(in);
            String str = null;
            while ((str=bufferRead.readLine())!=null) {
              StringTokenizer fenxi = new StringTokenizer(str);
              int count = fenxi.countTokens();
              str=str+"句子中单词个数"+count;
              bufferWrite.write(str);
              bufferWrite.newLine();
            }
            bufferWrite.close();
            out.close();
            in = new FileReader(fWrite);
            bufferRead = new BufferedReader(in);
            String s = null;
            System.out.println(fWrite.getName()+"内容:");
           while((s=bufferRead.readLine())!=null){
               System.out.println(s);
           }
           bufferRead.close();
           in.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
