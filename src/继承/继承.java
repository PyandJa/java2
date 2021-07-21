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
public class 继承 {
    public static void main(String[]args){
        Student zhang=new Student();
        zhang.age=17;//设置年龄
        zhang.number=100101;//设置学号
        zhang.showPeopleMess();//调用继承的方法
        zhang.tellNumber();//输出学号
        int x=9,y=29;
        System.out.print("会做加法 ");
        int result= zhang.add(x, y);
        System.out.printf("%d+%d=%d\n",x,y,result);
        
        UniverStudent geng=new UniverStudent();
        geng.age=21;
        geng.number=989874;
        geng.showPeopleMess();//调用继承的方法
        geng.tellNumber();//调用继承的方法
        System.out.print("会做加法 ");//调用继承的方法
        int result2=geng.add(x, y);
        System.out.printf("%d+%d=%d ",x,y,result2);
        System.out.print("会做乘法 ");
        int result3=geng.multi(x, y);
        System.out.printf("%d*%d=%d",x,y,result3);
    }
}
