/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * <li>该类是一个模式匹配类,用于匹配字符串在字符序列中出现的位置。
 * @author qf
 */
public class Pattern类 {
    public static void main(String[]args){

        String s2="市话：76.8元，长途：167.38元,短信:12.68元";
        Bill bill = new Bill();
        double sumprice=bill.GetBillSum(s2);
        System.out.println(sumprice);
    }
}
/**
 * 该类存储对账单进行模式匹配及处理的方法
 * @author 覃锋
 * @version v1.0
 */
class Bill{
    /**
     * 该方法用于对账单进行模式匹配并计数数值的和
     * @param s 账单
     * @return 账单价格的和
     */
    public double GetBillSum(String s){
        String regex="[0123456789.]+"; // 匹配数字序列
        Pattern p=Pattern.compile(regex); // 模式对象
        Matcher m=p.matcher(s); // 匹配对象
        double sum=0;
        while (m.find()) {            
            String item = m.group(); // 获取
            System.out.println(item); // 打印输出
            sum+=Double.parseDouble(item); // 转型求和
        }
        return sum;
    }
}
/*
        String input = "hello,good morning,this is a good idea";
        String regex="good"; // 是创建模式对象pattern时使用的正则表达式
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE); // pattern称为模式对象, 忽略大小写
        Matcher matcher = pattern.matcher(input); // matcher称为匹配对象
        matcher.group(); // 返回good
        matcher.start(); // 返回6,即good首次出现的位置
        matcher.end();   // 返回10,即good结束时的位置
        matcher.find(1);  // 从参数位置开始是否有和regex匹配的子序列：返回ture或false
        matcher.matches(); // 判断input是否完全和regex匹配
        matcher.lookingAt(); // 从开始位置是否有和regex匹配的子序列：返回ture或false
        matcher.replaceAll("你"); // 匹配到则替换为给定参数的值,input本身没有变化
        matcher.replaceFirst("你"); // 匹配则进行参数替换并返回一个String对象，input不变
*/
