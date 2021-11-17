/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

/**
 * <li>只能高转低，不能低转高
 * @author 13340
 */
public class 字符串和基本数据的相互转换 {
    public static void main(String[]args){
        int x;
        String s="87";
        //从字符串类型转数字类型。
        x=Integer.parseInt(s);//把字符串对象s转化为int类型
        byte x1;
        x1=Byte.parseByte(s);//转化为Byte型。
        short x2;
        x2=Short.parseShort(s);//转化为Short型。
        long x3;
        x3=Long.parseLong(s);//转化为Long型。
        float x4;
        x4=Float.parseFloat(s);//转化为Float型。
        double x5;
        x5=Double.parseDouble(s);//转化为Double型。
        //从数字类型转字符串类型：
        String str=String.valueOf(12313.9876);//Duoble转String。参数可以是所有。
        System.out.print(str);
        
    }
}
