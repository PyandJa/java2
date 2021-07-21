/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

import java.util.Date;

/**
 *
 * @author 13340
 */
public class 对象的字符串表示 {
    public static void main(String[]args){
        Date date=new Date();
        System.out.println(date.toString());//获取时间的字符串表示。
        TV tv=new TV();
        tv.setPrice(5897.98);
        System.out.println(tv.toString());//调用从写的toString方法。
    }
}
class TV{
    double price;
    public void setPrice(double m){
        price=m;
    }
    public String toString(){//TV类型从写toString方法
        String oldStr=super.toString();//调用隐藏的toString方法。:类名@引用
        return oldStr+"\n这是电视机,价格是："+price;  
    }
    /*
       public String toString()方法是Object类的一个方法，一个对象可以调用该方法获得
       该对象的字符串表示。返回的String对象的字符序列的一般形式为：
       创建对象的类名@对象的引用的字符串表示
    */
}

