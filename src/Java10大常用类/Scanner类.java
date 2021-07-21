/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author qf
 */
public class Scanner类 {
    public static void main(String[]args){
        String cost = "市话76.8元，长途：167.38元，短信 12.68元";
        double priceSum=GetPrice.giverPriceSum(cost);
        System.out.printf("%s\n总价:%.2f元\n", cost,priceSum);
    }
}
/**
 * 该类封装了Scanner类解析字符串数据的方法
 * @author 覃锋
 */
class GetPrice{
    /**
     * 该静态方法用于求字符串中数值的和
     * @param cost 给定的源字符串
     */
    public static double giverPriceSum(String cost){
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");// 设置scanner的分隔标记
        double sum=0;
        while (scanner.hasNext()) { // 查看是否仍有单词
            try{
                double price=scanner.nextDouble(); // 进行数字类型转换
                sum+=price;
            }
            catch(InputMismatchException exp){ // 异常信息
                String t = scanner.next(); // 读取下一个
            }
        }
        return sum;
    }
}