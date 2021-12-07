/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;
import java.nio.file.Files;

/**
 * @author  qf
 * @date    2021-12-6 23:41:43
 * @version V1.0
 * @desc    
 */
public class 对象流 {
    public static void main(String[]args){
        
        TV changhong = new TV();
        changhong.setName("长虹电视");
        changhong.setPrice(5678);
        File file = new File("television.txt"); // 在当前目录下创建该文本文件
        
        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(changhong);
            objectOut.close();
            
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            TV xinfei = (TV)objectIn.readObject();
            objectIn.close();
            xinfei.setName("新飞电视");
            xinfei.setPrice(666);
            System.out.println("changhong的名字:"+changhong.getName());
            System.out.println("changhong的价格："+changhong.getPrice());
            System.out.println("xinfei的名字:"+xinfei.getName());
            System.out.println("xinfei的价格:"+xinfei.getPrice());
            
            
         } catch (ClassNotFoundException event) {
             System.out.println("不能读出对象");
        }
        catch(IOException event){
             System.out.println(event);
        }
    }
}

class TV implements Serializable{  // Serializable:可序列化接口
    String name;
    int price;
    public void setName(String s){
        name = s;
    }
    public void setPrice(int n){
        price = n;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
     }
}
    
            
    
    
    
    
    
    
