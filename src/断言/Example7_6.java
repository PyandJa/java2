/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 断言;
import java.util.Scanner;

/**
 *
 * @author 13340
 */
public class Example7_6 {
    public static void main(String[]args){
        int[]score={-120,98,89,120,99};//存放学生成绩
        int sum=0;//总成绩
        for (int number:score) {//遍历数组
            assert number>=0:"负数不能是成绩";//使用断言
            sum+=number;//累加成绩
        }
        System.out.println("总成绩:"+sum);
    }
    /*
     断言：在代码调试阶段非常有用，用于不想try catch捕获错误时。
     java默认关闭断言，启动断言语句为:-ea
     assert booleanExpression和assert booleanExperession:messageException
     assert number>=0和assert number>=0:"负数不能是成"
    */
}
