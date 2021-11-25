/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * File类一般只用于读取文件的目录，长度，权限等，不涉及文件的读写操作。
 * @author  qf
 * @date    2021-11-25 23:03:02
 * @version V1.0
 * @desc    
 */
public class File类 {
    public static void main(String args[]){
        //----------------读取文件---------------
       File f = new File("D:\\学习任务\\java学习","java复习.txt");
       System.out.println(f.getName()+"是可读的吗？"+f.canRead()); // true or false
       System.out.println(f.getName()+"的长度:"+f.length());
       System.out.println(f.getName()+"的绝对路径："+f.getAbsolutePath());
       //-----------------创建文件---------------
       File file = new File("new.txt");
       System.out.println("在当前目录下创建新文件:"+file.getName());
        if (!file.exists()) { // 如果文件不存在
            try {
                file.createNewFile(); // 执行创建操作
                System.out.println("创建成功！");
            } catch (IOException exp) {
                
            }
        }
    }
}

