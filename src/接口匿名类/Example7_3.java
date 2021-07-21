/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口匿名类;

/**
 *
 * @author 13340
 */
public class Example7_3 {
    public static void main(String[]args){
        HelloMachine machine=new HelloMachine();
        machine.turnOn(new ISpeakHello(){//和接口有关的匿名类。
            //实现接口方法。
            @Override
            public void speak(){//英文问候
                System.out.println("hellow,you are welcome!");
            }
        });
        //lambda表达式实现://中文问候
        machine.turnOn(() -> {//和接口有关的lambda表达式。
            System.out.println("你好，欢迎光临！");
        });
        
    }
}
