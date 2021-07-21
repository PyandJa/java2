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
public class A implements ICompurerAverage {

    //从写接口方法,使用算术平均数计算接口。
    @Override
    public double average(double a, double b) {
      double aver=0;
      aver=(a+b)/2;
      return aver;
    }
    
}
