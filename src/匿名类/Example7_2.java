/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 匿名类;

/**
 *
 * @author 13340
 */
public class Example7_2 {
    public static void main(String[]args){
        ShowBoard board=new ShowBoard();
        board.showMess(new OutputEnglish());//参数是子类的对象。
        board.showMess(new OutputAlphabet(){//参数是匿名子类对象。
            //匿名类同样要重写父类的抽象方法。
            @Override
            public void output() {
                for (char c='α';c<='ω';c++) {
                    System.out.printf("%3c", c);//输出希腊字母。
                }
            }
        });
    }
    /*
        匿名类有如下特点:
    1.匿名类可以继承和重写父类的方法。
    2.匿名类一定是内部类。
    3.匿名类可以访问外嵌类的成员变量和方法，但不能声明静态成员变量和方法。
    4.由于匿名类是子类，但没有类名，所以使用匿名类创建对象时要直接使用
    父类的构造方法。
    */
}
