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
public class Example6 {
    public static void main(String[]args){       
        
        AdvertisementBoard board=new AdvertisementBoard();
        board.show(new WhiteCloudCorp());
        board.show(new BlackLandCorp());
        /*
         把接口、接口回调功能类和两个公司类理解为一个小开发框架
         Example6是使用该框架的用户程序，那么该框架满足"开-闭原则"
         该框架针对用户的需求就比较好维护,即如果用户要添加公司，则
         只需要简单扩展框架，即在框架中实现一个继承接口的类即可，而
         不用更改其他类。
        */
    }
}
