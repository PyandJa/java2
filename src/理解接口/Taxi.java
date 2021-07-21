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
//出租车类:刹车，收费，空调。
public class Taxi extends MotorVehicles implements IMoneyFare,IControlTemperature {

    //重写刹车方法《相同包里不用public。
    @Override
    void brake() {
        System.out.print("出租车使用碟式刹车技术。");
    }

    //重写收费方法
    @Override
    public void charge() {
       System.out.print("出租车:2元/公里，备注：起步价3公里。");
    }

    //重写空调
    @Override
    public void controlAirTemperature() {
        System.out.print("出租车安装了Hair空调。");
    }
    
}
