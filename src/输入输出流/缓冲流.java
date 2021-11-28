/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * @author  qf
 * @date    2021-11-28 23:53:05
 * @version V1.0
 * @desc    
 */
public class 缓冲流 {
    public static void mian(String[]args){
        
    }
}

/*
1.BufferedReader 和 BufferedWriter类创建的对象称为缓冲输入流、输出流。
2.二者增强了对文件的读取能力，可以每次读取一行数据，二FileReader类没有提供读取一行的方法。
3.二者的构造方法分别是：BufferedReader(Reader in)和 BufferedWriter(Writer out)
4.BufferedWriter有一个独特的写入回车符的方法：newLine()
*/