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
//广告类，实现接口回调
public class AdvertisementBoard {
    public void show(IAdvertisement adver){
        System.out.println(adver.getCorpName()+"的广告词如下:");
        adver.showAdvertisement();//接口回调
    }
}
