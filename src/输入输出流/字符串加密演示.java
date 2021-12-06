/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;
/**
 * @author  qf
 * @date    2021-12-6 23:01:59
 * @version V1.0
 * @desc    
 */
public class 字符串加密演示 {
    public static void main(String[]args){
        
        String command ="渡江总攻时间是4月22日晚上10点整";
        EncryptAndDecrypt person = new EncryptAndDecrypt();
        String password = "Tiger"; // 加秘密钥
        String secret = person.encrypt(command, password); // 加密
        File file = new File("secret.txt");
        
        try {
            FileOutputStream fos = new FileOutputStream(file); // 执行file的输入流
            DataOutputStream outData = new DataOutputStream(fos); // 写入到文件
            outData.writeUTF(secret); // 以独立于机器的编码写入
            System.out.println("加密命令："+secret);
        } catch (Exception e) {}
       
        try {
            FileInputStream fis = new FileInputStream(file); // 打开文件
            DataInputStream inData = new DataInputStream(fis); // 读取指定文件
            String str = inData.readUTF();
            String mingwen = person.decrypt(str, password); // 解密
            System.out.println("解密命令："+mingwen);
        } catch (Exception e) {}       
    }
}


/**
 * 加密类
 * @author qf
 */
class EncryptAndDecrypt{
    /**
     * 加密算法
     * @param sourceString 密码
     * @param password 密钥
     * @return 
     */
    String encrypt(String sourceString,String password){
        char[] p = password.toCharArray();
        int n = p.length;
        char [] c = sourceString.toCharArray();
        int m = c.length;
        for(int k=0;k<m;k++){
            int mima = c[k]+p[k%n]; // 加密
            c[k] = (char)mima;
        }
        return new String(c); // 返回密文
    }
    
    /**
     * 解密方法
     * @param sourceString 密码
     * @param password 密钥
     * @return 
     */
    String decrypt(String sourceString,String password){
        char[] p = password.toCharArray();
        int n = p.length;
        char [] c = sourceString.toCharArray();
        int m = c.length;
        for(int k=0;k<m;k++){
            int mima = c[k]-p[k%n]; // 解密
            c[k] =(char)mima;
        }
        return new String(c); // 返回密文
    }
}