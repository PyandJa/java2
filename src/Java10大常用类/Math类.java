/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.lang.Math;
/**
 * 该类存储了许多用于科学计算的静态方法
 * @author qf
 */
public class Math类 {
    public static void main(String[]args){
       Math.abs(15.3D); // 返回绝对值
       Math.max(1, 2);  // 返回a、b的最大值
       Math.min(1, 2);  // 返回a、b的最小值
       Math.random();   // 产生一个0~1之间的随机数(包括0不包括1)
       Math.pow(5, 2);  // 返回a的b次幂
       Math.sqrt(25);   // 返回a的平方根
       Math.log(100);   // 返回a的对数
       Math.sin(30);    // 返回a的正弦
       Math.asin(30);   // 返回a的反弦
       Math.ceil(15.2); // 返回大于a的最小整数:16.0
       Math.floor(15.2);   // 返回小于a的最小整数:15.0
       Math.round(-15.50); // 返回四舍五入后的值(小数小于等于0.5的舍):-15
    }
}
