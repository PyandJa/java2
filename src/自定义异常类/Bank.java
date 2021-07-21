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
public class Bank {
    private int money;
    //计算纯收入
    public void income(int in,int out)throws BankException{//throws声明异常
        if(in<=0||out>=0||in+out<=0){
            throw new BankException(in,out);//throw抛出异常,该方法停止执行。
        }
        int netIncome=in+out;//纯收入=收入+支出
        System.out.printf("本次计算出的纯收入是:%d元\n", netIncome);
        money+=netIncome;//最后计算总和      
    }
    //获取当前总额
    public int getMoney(){
      return money;   
    }
}
