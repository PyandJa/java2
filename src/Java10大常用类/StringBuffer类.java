/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

/**
 * StringBuffer类可以动态添加字符串。
 * @author qf
 */
public class StringBuffer类 {
    public static void main(String[]args){
        StringBuffer str = new StringBuffer();// 无参构造
        str.append("大家好"); // appen追加字符
        System.out.println("str:"+str);
        System.out.println("length:"+str.length()); // length获取字符串长度
        System.out.println("capacity:"+str.capacity()); // 获取实际容量
        
        str.setCharAt(0, 'w'); // 将索引为0的字符替换为w
        System.out.println(str);
        
        str.insert(2, "are all"); // insert将指定字符插入到给定位置
        System.out.println(str);
        
        int index=str.indexOf("好");
        System.out.println(index); // indexOf获取知道字符所在的位置
        
        str.replace(index, str.length(), "right");// 指定范围内的替换
        System.out.println(str);
    }
}
class getSBmethod{
    
}
