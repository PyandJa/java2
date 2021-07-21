/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口;


/**
 *
 * @author 13340
 */
public class Example6_1 {
    public static void main(String[] args){
        China china=new China();
        Japan japan=new Japan();
        china.number=32+Computable.MAX;
        japan.number=14+Computable.MAX;
        System.out.print("chang的学号:"+china.number+" chang求和结果:"+china.f(100)+"\n");
        System.out.print("henlu学号:"+japan.number+" henlu求和结果:"+japan.f(100));
    }
}
