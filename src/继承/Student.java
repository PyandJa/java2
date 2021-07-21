/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 继承;

/**
 *
 * @author 13340
 */
//学生类，继承人类
public class Student extends People {
    int number;//存储学号
    //显示学号
    void tellNumber(){
        System.out.printf("学号:%d\t",number);
    }
    //加法
    int add(int x,int y){
        return x+y;
    }
}
