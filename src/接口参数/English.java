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
//英国式问候类。
public class English  implements ISpeakHello {

    //从写接口方法。
    @Override
    public void speakHellow() {
        System.out.print("英国人习惯问候语:你好，天气不错");
    }
    
}
