/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 带finally;

/**
 *
 * @author 13340
 */
//自定义货船危险列外异常
public class DangerException extends Exception{
    final String message="超重";//自定义异常消息。
    public String warnMess(){//返回自定义异常消息。
        return message;
    }
}
