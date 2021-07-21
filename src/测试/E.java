/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 测试;

/**
 *
 * @author 13340
 */
interface Com{
   public void speak();
}
public class E {
    public static void main(String[]args){
        
        Com p=new Com(){
          public void speak(){
              System.out.println("p是接口变量");
           }  
        };
        p.speak();
    }
}
