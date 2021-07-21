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
//运行入口
public class Example6_3 {
    public static void main(String[]args){
        //声明对象
        Bus bus101=new Bus();//公共汽车
        Taxi buleTaxi=new Taxi();//出租车
        Cinema redStarCinema=new Cinema();//电影院
        //声明接口
        IMoneyFare fare;//声明收费接口。
        IControlTemperature temperature;//声明空调接口。
        //调用实现
        fare=bus101;//收费接口上转型。
        bus101.brake();//刹车方法
        fare.charge();//收费方法
        
        fare=buleTaxi;//收费接口上转型。
        temperature=buleTaxi;//空调接口上转型。
        buleTaxi.brake();//刹车方法
        fare.charge();//收费方法
        temperature.controlAirTemperature();//空调方法
        
        fare=redStarCinema;//收费接口上转型。
        temperature=redStarCinema;//空调接口上转型。
        fare.charge();//收费方法
        temperature.controlAirTemperature();//空调方法
        
    }
}
