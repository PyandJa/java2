/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

/**
 *      <li>1.String类的构造方法String(byte[])用指定得字节数组构造一个String对象。
        String(byte[],int offset,int length)构造方法用指定的字节数组的一部分，
        即从数组起始位置offset开始获取length个字节，构造一个String对象。
         <li>2.public byte[]getBytes(String charsetName)方法使用平台默认字符编码，
        将当前String对象的字符序列存放到字节数组中，并返回数组的引用。
         <li>3.toCharArray：对字符串进行数组转换
        。。。
 * @author 13340
 */
public class 字符串与字符数组字节数组 {
    /**
     * 
     * @param args 这是要使用的方法参数
     */
    public static void main(String[]args){
        char [] a,c;
        String s="1945年8月15日是抗战胜利日";
        a=new char[4];
        s.getChars(11, 15, a, 0);
        System.out.println(a); //换行输出
        c="十一长假期间，学校都放假了".toCharArray();
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]);
        
    }
      
}
