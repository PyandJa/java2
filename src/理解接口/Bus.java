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
//公共汽车类:有刹车，有收费。
public class Bus extends MotorVehicles implements IMoneyFare {

    //重写刹车
    @Override
    void brake() {
        System.out.print("公共汽车使用鼓式刹车技术。");
    }

    //重写收费
    @Override
    public void charge() {
        System.out.print("公共汽车：一元/张。备注：不计算公里数。");
    }
    
}
