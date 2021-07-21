/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口参数;

/**
 *
 * @author 13340
 */
public class Example6_5 {
    public static void main(String[]args){
        KindHello Hellow=new KindHello();
        Hellow.lookHellow(new Cinese());//中国式问候
        Hellow.lookHellow(new English());//英国式问候
        /*
        abstract类和接口的比较:
        1.抽象类本质是一个类，定义的前提是类里有抽象方法
         或者是该类并没有完全实现父类里的抽象方法.
        2.抽象类和接口都可以有抽象方法。
        3.接口不可以有变量，只能有常量，而抽象类即可以有变量也可以有常量。
        4.抽象类可以有非抽象的方法，而接口不可以，接口只能有抽象方法。
        */
    }
}
