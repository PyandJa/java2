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
//接口类型参数，接口回调
public class KindHello {
    public void lookHellow(ISpeakHello Hellow){//接口类型参数
        Hellow.speakHellow();//问候方法。接口回调
    }
}
