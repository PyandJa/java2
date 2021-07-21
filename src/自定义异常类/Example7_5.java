/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 自定义异常类;

/**
 *
 * @author 13340
 */
public class Example7_5 {
    public static void main(String[]args){
        Bank bank=new Bank();
        try{
           bank.income(200, -100);
           bank.income(300, -100);
           bank.income(400, -100);
           System.out.printf("银行目前有%d元\n",bank.getMoney());
           bank.income(200, 100);//发生异常。
           bank.income(99999, -100);//该句终止执行。
        }
        catch(BankException e){
            System.out.println("计算收益的过程出现如下问题:");
            System.out.println(e.warnMess());
        }
        System.out.printf("银行目前有:%d元\n", bank.getMoney());       
    }
}
