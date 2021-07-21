/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.io.Console;

/**
 * Java.io.Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，
 * 在 Eclipse 或者其他 IDE 的控制台是用不了的。
 * 不希望用户输入的内容回显
 * @author qf
 */
public class Console类 {
    public static void main(String[]args){
        // Console cons = System.console(); // 调用System类的console方法返回一个Console类型的对象
        // char[] passwd = cons.readPassword(); // readpassword方法读取用户键盘输入
        boolean success=false; // 标记是否正确
        int count=0;  // 记录输入密码次数
        Console cons; 
        char[]passwd; // 存储密码
        cons=System.console();
        while(true){
            System.out.println("输入密码:");      
            if(cons==null){System.out.println("cons对象位空！");break;} // cons无法在IDE里运行
            passwd=cons.readPassword(); // 读取键盘            
            count++; // 计数器加1
            String password = new String(passwd); // 数组转换为字符串
            if (password.equals("123456")) {
                success=true;
                System.out.println("第"+count+"次输入密码正确");
                break; // 退出循环
            }
            else{
                System.out.println("第"+count+"次输入密码不正确");
            }
            if (count==3) {
                System.out.println("您第"+count+"次输入密码都不正确");
                System.exit(0); // 关闭程序
            }            
        }
        if (success) {
            System.out.println("你好，欢迎您！");
        }
    }
}
