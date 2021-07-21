/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 匿名类;

/**
 *
 * @author 13340
 */
public class OutputEnglish extends OutputAlphabet{

    //重写父类的抽象方法
    @Override
    public void output() {
        for (char c ='a'; c <= 'z'; c++) {
            System.out.printf("%3c",c);//输出26个英文字母。
        }
        System.out.print("\n");
    }
    
}
