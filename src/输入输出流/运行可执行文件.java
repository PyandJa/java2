/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * @author  qf
 * @date    2021-11-27 22:48:20
 * @version V1.0
 * @desc    
 */
public class 运行可执行文件 {
    public static void main(String[]args){
        try {
            
            Runtime ce = Runtime.getRuntime(); // 创建类的静态对象
            File file = new File("D:\\迅雷下载","PotPlayerSetup64.exe"); // 打开指定路径的可执行文件。
            ce.exec(file.getAbsolutePath()); // 获取到程序路径
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}