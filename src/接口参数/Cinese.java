/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 接口参数;

/**
 *
 * @author 13340
 */
//中国式问候类
public class Cinese implements ISpeakHello{

    //重写接口方法。
    @Override
    public void speakHellow() {
       System.out.print("中国人习惯问候语:你好，吃饭了吗？\n");
    }
    
    
}
