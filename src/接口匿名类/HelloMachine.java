/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口匿名类;

/**
 *
 * @author 13340
 */
//中间类。
public class HelloMachine {
    public void turnOn(ISpeakHello hello){//传递接口参数。
        hello.speak();//执行接口方法。
    }
}
