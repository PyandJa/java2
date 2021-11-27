/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;
     

/**
 * @author  qf
 * @date    2021-11-26 16:43:12
 * @version V1.0
 * @desc    
 */
public class 文件的创建与删除 {
      public static void main(String[]args){
          File file = new File("D:\\学习任务\\java学习\\基础学习测试","new.java");
          file.delete(); // 如果目录中有该文件，则调用该方法可删除该文件。
      }
}

