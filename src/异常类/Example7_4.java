/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 异常类;

/**
 *
 * @author 13340
 */
public class Example7_4 {
    public static void main(String[]args){
        int n=0,m=0,t=1000;
        try{
            m=Integer.parseInt("888");//把Strin类型转换为int
            n=Integer.parseInt("ab89");//转换出错，发出异常
            t=777;//无法执行
        }
        catch(NumberFormatException e){//NumberFormatException:数字格式异常
            System.out.print("发生异常:"+e.getMessage());//获取异常信息
        }
        System.out.println("n="+n+",m="+m+",t="+t);
        
        try{
            System.out.println("故意抛出I/O异常！");
            throw new java.io.IOException("我是故意的");//故意抛出异常
            //System.out.println("该输出语句就无法执行，但要注释否则报错")
        }
        catch(java.io.IOException e){//IOException异常都是Exception的子类
            System.out.println("发生异常:"+e.getMessage());
        }
    }
    
}
