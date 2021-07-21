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
//货船类：超重时拒绝装载，准点启航。
public class CargoBoat {
    int realContent;//装载的重量
    int maxContent;//最大承重
    public void setMaxContent(int c){//设置最大承重
        maxContent=c;
    }
    public void loading(int m)throws DangerException{//装载
        realContent+=m;
        if (realContent>maxContent) {
            realContent-=m;
            throw new DangerException();//抛出异常，方法停止。
        }
        System.out.println("目前装载了"+realContent+"吨货物");
    }
}
