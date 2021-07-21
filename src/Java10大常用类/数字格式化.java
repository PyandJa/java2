/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

/**
 * 用于对各种类型数字进行格式化
 * @author qf
 */
public class 数字格式化 {
    public static void main(String[]args){
        String s = String.format("%.2f", 3.1215926); // 保留2位小数
        String s1 = String.format("%d元%.3f公斤%d台",888,999.777666,123); // 参数个数要对应
        String s2 = String.format("不是从左到右:%2$.3f,%3$d,%1$d",1,2.01,3); // 使用$指定位置
        String s3 = String.format("%d%%", 89); // 后面加两个%%显示89%
        System.out.println(s3);
        
        // 格式化整数：%d,%o,%x,%X可以格式化整数
        String s4 = String.format("%d,%o,%x,%X", 12,12,12,12); //
        System.out.println(s4);//d十进制,o为八进制,x小写十六进制,X大写十六进制
        
        // 修饰符：
        String s5 = String.format("按千分组:%,d", 12345678); // 逗号表示按千分组
        String s6 = String.format("%+d", 123); // 指定正号
        System.out.println(s6);
        
        // 数据的宽度：将数据整体格式化为宽度为n的字符，用空格替代
        String s7 = String.format("%8d", 59); // 在数字左边添加6个空格,长度是8
        String s8 = String.format("%-8d",59); // 在数字右边添加6个空格,长度是8
        String s9 = String.format("%08d", 59);// 用0替代,长度是8
        System.out.println(s9); 
        
        // 格式化浮点数：
        String s10 = String.format("%f,%e", 13579.98,13579.98);
        System.out.println(s10);
        
        // 修饰符：%f,%e,%E,%g,%G,%a,%A可以格式化浮点数float Float double Double
        String s11 = String.format("%+,f", 123456.789); // %f格式化为十进制浮点数，小数保留6位
        System.out.println(s11); // 指定正号，整数部分按千分组 
        //%e和%E格式化为科学计数法的十进制浮点数
        
        // 限制小数位数的宽度：
        String s12 = String.format("%11f", 59.88); // 小数点保留6位,左边添加2个空格
        String s13 = String.format("%-11f", 59.88); // 小数点保留6位,右边添加2个空格
        String s14 = String.format("%011.2f", 59.88); // 左边添加6个0,并保留小数点后2位
        String s15 = String.format("%011f", 59.88);// 左边添加2个0,右边保留6位
        System.out.println(s15);
    }
}
