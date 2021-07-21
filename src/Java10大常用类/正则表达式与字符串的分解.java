/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.Scanner;
/**
 * @author 13340
 */
public class 正则表达式与字符串的分解 {
    public static void main(String[]args){
        正则表达式与字符串的分解 s=new 正则表达式与字符串的分解();
        s.ReplacementDecomposition("s");
        s.ReplacementDecomposition();
    }
    /**
     * 分解出字符串里的数字。
     * @param str 要分解的源字符串。
     */
    public void ReplacementDecomposition(String str){
        str="中国人民共和国成立于1949年10月1日";
        String digitWord[]=str.split("\\D+");
        for (String digitWord1 : digitWord) { //增强型for循环。
            System.out.print(digitWord1);
        }
        System.out.println("\n");
    }
    /**
     * 方法的重载：0个参数。
     */
    public void ReplacementDecomposition(){
        
        System.out.println("请输入要分解的文本:");
        Scanner rander=new Scanner(System.in);
        String str=rander.nextLine();
        //regex匹配由空格、数字和！”#%&‘()*+-./:;<=>?@[\]^_`{|}~组成的字符序列。
        String regex="[\\s\\d\\p{Punct}]+";
        String words[]=str.split(regex);
        for (int i = 0; i < words.length; i++) {
            int m=i+1;      
            System.out.println("单词"+m+":"+words[i]);
        }
    }       
}
//1.split方法用于以给定的正则表达式参数分解字符串。
