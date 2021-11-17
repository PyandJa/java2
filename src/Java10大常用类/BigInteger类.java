/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.math.BigInteger;
/**
 * <p>该类用于处理特别大的整数</p>
 * @author qf
 */
public class BigInteger类 {
    public static void main(String[]args){
        BigInteger result = new BigInteger("0"),
                   one = new BigInteger("123456789"),
                   two = new BigInteger("987654321");
        result = one.add(two);      // add方法计算和
        System.out.println(result);
        result = one.multiply(two); // multiply方法计算积
        System.out.println(result);
    }
}
