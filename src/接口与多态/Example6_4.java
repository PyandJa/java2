/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口与多态;

/**
 *
 * @author 13340
 */
public class Example6_4 {
    public static void main(String[]args){
        ICompurerAverage Icom;
        Icom=new A();      
        double a=10,b=5;
        System.out.print(""+a+"和"+b+"的算术平均数是: "+Icom.average(a, b)+"\n");       
        Icom=new B();
        System.out.print(""+a+"和"+b+"的几何平均数是: "+Icom.average(a, b));
        
    }
}
