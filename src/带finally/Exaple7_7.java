/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 带finally;

/**
 *
 * @author 13340
 */
public class Exaple7_7 {
    public static void main(String[]args){
        CargoBoat ship=new CargoBoat();
        ship.setMaxContent(1000);//最大承重6000
        int m=600;
        try{//多次装载...
            ship.loading(m);
            m=400;
            ship.loading(m);
            m=367;
            ship.loading(m);
            m=555;
            ship.loading(m);
        }
        catch(DangerException e){
            System.out.println(e.warnMess());
            System.out.println("无法再装载重量是"+m+"吨的集装箱");
        }
        finally{
            System.out.printf("货船将正点启航");
        }
        
    }
}
