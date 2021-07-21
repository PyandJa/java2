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
//黑土集团
public class BlackLandCorp implements IAdvertisement {

    //重写接口广告方法
    @Override
    public void showAdvertisement() {
        System.out.println("*****************");
        System.out.printf("劳动是爹\n劳动是妈\n");
        System.out.println("*****************");
    }

     //重写接口公司方法
    @Override
    public String getCorpName() {
        return "黑土集团";
    }
    
}
