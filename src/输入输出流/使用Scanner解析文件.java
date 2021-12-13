/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;
import java.util.*;

/**
 * 如何使用Scanner类对象解析文件中的数据
 * @author  qf
 * @date    2021-12-13 23:28:11
 * @version V1.0
 * @desc    
 */
public class 使用Scanner解析文件 {
    public static void main(String[]args){
        MurenScanner.ZZJX();
    }
}
/**
 * 解析文件流
 * @author qf
 */
class MurenScanner{
    /**
     * 使用默认分隔标记解析文件
     */
    public static void MRJX(){
        File file = new File("cost.txt");
        Scanner sc = null; // sc默认使用空格作为分隔标记
        int sum = 0;
        try {
            sc = new Scanner(file); 
            while(sc.hasNext()){ // 计算cost文本内容数字的和
                try {
                    int price = sc.nextInt(); // 数值类型数据转化
                    sum = sum+price;
                    System.out.println(price);
                } catch (InputMismatchException exp) {
                    String t = sc.next(); // 处理异常时调用next方法返回该非数字化单词
                }
            }
           System.out.println("Totall Cost:"+sum+" dollar");
        } catch (Exception exp) {
            System.out.print(exp);
        }
    }
    /**
     * 使用正则表达式解析
     */
    public static void ZZJX(){
        File file = new File("student.txt");
        Scanner sc = null;
        int count=0;
        double sum=0;
        try {
            double score = 0;
            sc = new Scanner(file);
            sc.useDelimiter("[^0123456789.]+"); // 正则匹配
            while(sc.hasNextDouble()){ // 最后一个Double已被next返回则返回false
                score = sc.nextDouble();
                count++;
                sum = sum+score;
                System.out.println(score);
            }
            
            double aver = sum/count;
            System.out.print("平均成绩："+aver);
            
        } catch (Exception exp) {
            System.out.println(exp);
        }
       
    }
    
}







