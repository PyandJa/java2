/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;

/**
 *
 * @author 13340
 */
public class 增强型for循环 {
    public static void main(String[] args){
        double sum=0,item=0;
        boolean computable=true;
        
        for (String s:args) {
            try{
               item=Double.parseDouble(s);//数据类型转换。
               sum+=item;
            }
            catch(NumberFormatException e){
               System.out.println("您输入了非数字字符:"+e);
               computable=false;
            }
        }
        if (computable) {
            System.out.println("sum="+sum);
        }
    }
    /*
        可以直接使用main类的参数args传递参数。
    */
}
