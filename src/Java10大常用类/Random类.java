/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.Random;

/**
 * 该类用于生成随机数
 * @author qf
 */
public class Random类 {
    public static void main(String[]args){
        Random random = new Random();  // 不带参数的构造方法
        int s=random.nextInt(); // 随机数生成器-以当前系统时间为种子,生成1组随机数
        int s2=random.nextInt(100);    // 生成0-99区间的随机数
        double s3=random.nextDouble(); // 生成0.0-0.9区间的随机数
        boolean s4=random.nextBoolean(); // 生成True或False随机数
        System.out.println(s4);
        
        int a[]=GetRandomNumber.getRandomNumber(100, 8);
        System.out.println(java.util.Arrays.toString(a)); // Arrays
    }
}
/**
 * 该类用于获取区间随机数
 * @author 覃锋
 * @version  v1.0    
 */
class GetRandomNumber{
    /**
     * 该方法获取1~max之间的amount个随机数
     * @param max 最大值
     * @param amount 生成的数量
     * @return 返回整型数组
     */
    public static int [] getRandomNumber(int max,int amount){
        int[] randomNumber = new int[amount];
        int index=0;
        randomNumber[0]=-1;
        Random random = new Random();
        while (index<amount) {
            int number = random.nextInt(max)+1;
            boolean isInArrays=false;
            for(int m:randomNumber){
                if (m==number) {
                    isInArrays=true; // number在数组里了
                }
            }
                if (!isInArrays) {
                    // number不在数组里的话:
                    randomNumber[index] = number;
                    index++;
                }            
        }
        return randomNumber;
    }
}
/* Javadoc关于类的说明:
        author:作者
        deprecated:已弃用
        param:参数
        see:看见
        serial:排序
        since:自从
        version:版本
*/ 
/* Javadoc关于方法的说明
param：参数
return：返回
see：看见
since：自从
deprecated：已弃用
exception：列外
seriaIData：串行数据
throws：抛出
*/
