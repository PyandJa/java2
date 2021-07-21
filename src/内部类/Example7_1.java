/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 内部类;

/**
 *
 * @author 13340
 */
public class Example7_1 {
    public static void main(String[]args){
        RedCowForm form=new RedCowForm("红牛农场");
        form.showCowMess();//输出牛信息
        form.cow.speak();//输出牛信息
        /*
          内部类即在类内部的类，内部类有三大特点:
        1.内部类的外嵌类的成员变量在类内部仍然有效,内部类方法可以调用外嵌类方法。
        2.内部类类体中不可以声明类变量和方法。外嵌类类体中可以使用内部类声明的
        对象作为其成员。
        3.内部类仅供外嵌类使用，其他类不能使用。
        @@注意:因为类是一种数据类型，所以内部类也可以是static，但是这样就不能调用
        外嵌类的成员变量 ：外嵌类.内部类 对象名称=new 外嵌类.内部类(参数);
        @@注意：非内部类不可以是static类。
        */
    }   
}
