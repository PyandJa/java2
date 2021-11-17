/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.Date;


/**
 * 这是一个矩形类
 * @author 覃锋
 * @version v1.0
 */
class Rect{
    double width,height,area;
    public double getArea(){
        area=width*height;
        return area;
    }
}
/**
 * <li>Class类可以帮助程序创建其他类的实列
 * <li>经常用于加载数据库驱动相关的类
 * @author qf
 */
public class Class类 {
    public static void main(String[]args){
        try{
            Class cs = Class.forName("Java10大常用类.Rect"); // 同一个包内也要写包名
            Rect rect = (Rect)cs.newInstance();
            rect.height=100;
            rect.width=200;
            System.out.println("面积="+rect.getArea())
                    ;
            cs=Class.forName("java.util.Date");            
            Date date = (Date)cs.newInstance();
            System.out.println(String.format("%tF %<tT %<tA", date));
                               
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
