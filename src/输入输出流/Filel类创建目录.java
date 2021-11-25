/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;

/**
 * @author  qf
 * @date    2021-11-25 23:32:34
 * @version V1.0
 * @desc    
 */
public class Filel类创建目录 {
    public static void main(String[]args){
        File dirFile = new File("."); // .表示上一层目录
        FileAccept fileAccept = new FileAccept();
        fileAccept.setExtendName("java"); // 设置java类型文件
        String fileName[] = dirFile.list(fileAccept); // 接口回调：用字符串形式返回目录下所有.java类型文件
        for(String name:fileName){ // 使用增强for循环列出所有.java类型的文件名称
            System.out.println(name);
        }
    }
}

class FileAccept implements FilenameFilter{

    private String extendName;
    /**
     * 设置扩展名
     * @param s 扩展名名称
     */
    public void setExtendName(String s){
        extendName = "."+s; // 构造文件类型
    }
    @Override
    public boolean accept(File dir, String name) { // 重写接口中的方法
       return name.endsWith(extendName);
    }
        
}