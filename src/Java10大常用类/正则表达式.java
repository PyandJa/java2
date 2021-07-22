/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.*;
/**
 *用于学习测试java的正则表达式
 * @author 13340
 */
public class 正则表达式 {
    public static void main(String[]args){
        Example8_9 zz=new  Example8_9();
        zz.NewreplaceAll();
    }
}             
class Example8_9{
    /**
     * 正则表达式匹配。
     */
  void  NewMatches(){
      String regex="[a-zA-Z|0-9|_]+";
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str.matches(regex)){ //matches方法有
            System.out.println(str+"是由英文或数字或字母或下划线组成的");
        }
        else{
            System.out.println(str+"中有非法字符");
        }
  }
  /**
   * 用于字符串替换。
   */
  void NewreplaceAll(){
      String str="欢迎大家访问广财教务系统:http://www.gxufe.edu.cn";
      String regex="(http://|www)\56?\\w+\56{1}\\w+\56{1}\\p{Alpha}+";
      System.out.printf("替换\"%s\"\n中的网站链接信息后得到的字符串:", str);
      str=str.replaceAll(regex, "********");
      System.out.print(str);
  }
}
//1.matches方法用于指定该字符串是否满足参数中的正则表达式。
//2.replaceAll以指定表达式替换内容

