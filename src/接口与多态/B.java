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
public class B implements ICompurerAverage{

    //重写接口方法,使用几何平均数计算。
    @Override
    public double average(double a, double b) {
        double aver=0;
        aver=Math.sqrt(a*b);
        return aver;
    }
    
}
