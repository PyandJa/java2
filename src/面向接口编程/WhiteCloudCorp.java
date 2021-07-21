/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 面向接口编程;

/**
 *
 * @author 13340
 */
//白云公司
public class WhiteCloudCorp  implements IAdvertisement{

    //重写接口广告方法
    @Override
    public void showAdvertisement() {
       System.out.print("飞机中的战斗机，哎yes!\n");
       System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@\n");
    }

    //重写接口公司方法
    @Override
    public String getCorpName() {
        return "白云公司";
    }
    
}
