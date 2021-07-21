/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 继承;

/**
 *
 * @author 13340
 */
//人类作为父类
public class People {
    int age,leg=2,hand=2;
    //显示基本信息
    protected void showPeopleMess(){
        System.out.printf("%d岁，%d只脚，%d只手\t",age,leg,hand);
    }
}
