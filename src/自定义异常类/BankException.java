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
//自定义异常类，继承Exception类
public class BankException extends Exception {
    String message;//异常消息。
    public BankException(int m,int n){//构造异常信息：
        message="入账资金"+m+"是负数或支出"+n+"是正数，不符合系统要求。";
    }
    //输出异常信息
    public String warnMess(){
        return message;//返回异常信息。
    }
}
