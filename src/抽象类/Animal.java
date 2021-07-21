/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 抽象类;
import java.util.*;
/**
 *
 * @author 13340
 */

/*这是一个模拟器的抽象类：抽象类的作用 
1：抽象出重要的标准和行为。
2：作为子类的上转型对象，即调用子类重写的方法-体现出了子类根据抽象类的行为标准给出的具体行为。
*/
public abstract class Animal {
  //封装了两个行为标准
  public abstract void cry();              //叫声
  public abstract String getAnimalName(); //类型
}

//模拟器
class Simulator{
   void playSound(Animal animal){
        if (animal==null) {
            System.out.print("还没有绑定");
        }else {
        
           System.out.print("\n动物叫声:");
           animal.cry();//播放声音
           System.out.print("\n动物类型:");
           System.out.print(animal.getAnimalName());//显示动物类型
        }     
     }
}

//狗
class Dog extends Animal{
    @Override
    public void cry(){
        System.out.print("哇哇哇");
    }
    @Override
    public String getAnimalName(){
       return "狗";
    }
}

//猫
class Cat extends Animal{
    @Override
    public void cry() {
        System.out.print("喵喵喵");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
   
}
         

