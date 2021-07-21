/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.*;
/**
 *
 * @author 13340
 */
public class 字符串得加密算法 {
    public static void main(String []args){
     String  s="明天计划取消";
     字符串得加密算法 加密=new 字符串得加密算法();
     System.out.println("请输入加密密钥:");
     Scanner scanner=new Scanner(System.in);
     String password=scanner.nextLine();
     String miwen= 加密.encrypt(s, password);
     System.out.println("密文:"+miwen);
     System.out.println("输入解密密钥:");
     password=scanner.nextLine();
     String source=加密.decrypt(miwen, password);
     System.out.println("明文:"+source);
    }
    /**
     * 这是实现字符串加密的方法 
     *@param sourcesString 该参数是源字符串
     *@param password 该参数是加密字符串
     */
    String encrypt(String sourcesString,String password){
        char[]p=password.toCharArray();
        int n=p.length;
        char[]c=sourcesString.toCharArray();
        int m=c.length;
        for(int k=0;k<m;k++){
            int mima=c[k]+p[k%n];//加密
            c[k]=(char)mima;
        }
        return new String(c);//返回密文
    }
    /**
     * 解密的方法
     * @param sourceString 源字符串
     * @param  password 解密字符串
     */
    String decrypt(String sourceString,String password){
        char[]p=password.toCharArray(); //toCharArray:转换为数组
        int n=p.length;
        char[]c=sourceString.toCharArray();
        int m=c.length;
        for(int k=0;k<m;k++){
            int mima=c[k]-p[k%n];
            c[k]=(char)mima;
        }
        return new String(c);//返回解密的密文   
    }
    
}
