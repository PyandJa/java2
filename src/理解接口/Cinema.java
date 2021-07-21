/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 理解接口;

/**
 *
 * @author 13340
 */
//电影院类：收费，空调
public class Cinema implements IMoneyFare,IControlTemperature{

    //重写收费
    @Override
    public void charge() {
        System.out.print("电影院:门票，十元/张。");
    }
   //重写空调
    @Override
    public void controlAirTemperature() {
        System.out.print("电影院安装了中央空调。");
    }
    
}
