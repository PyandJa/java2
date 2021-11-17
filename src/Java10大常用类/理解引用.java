/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

/**
 *<code>理解String对象和常量、实体和引用</code>
 * @author 13340
 */
//
public class 理解引用 {
    public static void main(String[]args){
        String hello="你好";//常量赋值给String对象。
        String testOne="你"+"好";//常量并置，仍然得到常量。
        System.out.println(hello == testOne);//True
        System.out.println("你好"==hello);//True
        System.out.println("你好"==testOne);//True
       
        String you="你";
        String hi="好";
        String testTwo=you+hi;//String testTwo=new String("你好");
        System.out.println(hello==testTwo);//false
        String testThree=you+hi;//String testThree=new String("你好");
        System.out.println(testTwo==testThree);//false
        
        /*
         1.对象==对象：是判断两个字符串引用是否相等。
         2."你好":是常量，会存储在常量池中(常量池中的数据在程序运行中再也不会改变)
         3.String you="你好":表面是常量实体直接赋值给字符串对象，其实赋值的是常量
           的实体的引用。
         4.用String类声明并创建对象:String you=new String("你");这样会在动态
           区开辟一个内存对象。
         5.String s1; s1="你好":相当于动态区中的字符串对象s1引用了常量"你好"的引用。
         6.并置运算(+)：常量和常量并置任然是常量如 "你"+"好"; 只有一个变量则是变量 如
           testTwo=you+hi;因为 you和hi都是字符串的对象，都存储在动态区中。都是
            new String("***")的形式。
        */
       
    }
}
