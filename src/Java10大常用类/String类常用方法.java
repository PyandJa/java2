/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.*;

/**
 *    <li>1.public int length():获取字符串序列长度。
      <li>2.public boolean equals(String s):比较当前对象的字符序列与参数s是否相同。
      <li>3.public boolean startsWith(String s):判断当前对象的字符前缀是否是参数字符。
      和 pubic boolean endsWith(String s)：判断当前对象的字符后缀是否是参数字符。
      <li> 4.public int compareTo(String s):按字典序与参数比较大小，相同则返回0，大于s
       则返回正值,小于s则返回负值。
      <li> 5.public boolean contains(String s):判断对象的字符中是否包含有参数的字符。
      <li> 6.public int indexOf(String s)：从零开始检索字符串s首次出现的位置。
       public int lastIndexOf(String s):从零开始价检索字符串s最后一次出现的位置。
       public int indexOf(String str,int startpoint):是一个重载方法,startpoint
       参数用于指定检索的开始位置。没有检索到则返回-1，空格算一个字符。
      <li> 7.pubic String substring(int s):复制s到序列最后。
       public String substring(int start,int end):复制start到end-1位置。
       <li> 8.public String trim():获得新的不包含空格的String对象。
 * @author 13340
 */
public class String类常用方法 {
    public static void main(String[]args){
        String s1,s2;
        s1=new String("天道酬勤");
        s2=new String("天道酬勤");
        System.out.println(s1.equals(s2));//true比较当前对象的字符序列与s1是否相同
        System.out.println(s1==s2);//false比较两个引用是否相同
        
        String s3,s4;
        s3="we are students";
        s4=new String("we are students");
        System.out.println(s3.equals(s4));//true
        System.out.println(s3==s4);//false
        
        String s5,s6;
        s5="勇者无敌";
        s6="勇者无敌";
        System.out.println(s5.equals(s6));//true
        System.out.println(s5==s6);//true
        
        String []a={"meon","apple","pear","banana"};
        String []b={"西瓜","苹果","梨","香蕉"};
        System.out.println("使用自定义的SortString类方法按字典序排序数组a：");
        SortString.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" "+a[i]);
        }
        System.out.println("");
        System.out.println("使用类库中的Arrays类，按字典序列排序数组b:");
        Arrays.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(" "+b[i]);
        }
    }   
       
}
//
class SortString{
        public static void sort(String a[]){
            int count=0;
            for (int i = 0; i < a.length-1; i++) {
                for (int j =i+1; j <a.length; j++) {
                    if (a[j].compareTo(a[i])<0) {//compareTo的使用。
                        String temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
        }
    }
