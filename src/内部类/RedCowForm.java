/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 内部类;

/**
 *
 * @author 13340
 */
/*
 建立一个特殊农场，该农场有红牛，其他而其他农场没有
 用内部类实现。
*/
public class RedCowForm {
    static String formName;//农场名称
    RedCow cow;//内部类声明对象
    RedCowForm(){}//构造函数1
    RedCowForm(String s){//构造函数2
        cow=new RedCow(150,112,5000);//设置牛参数
        formName=s;//设置农场名称
    }
    public void showCowMess(){
        cow.speak();//调用内部类
    }
    //内部类声明，红牛
    class RedCow{
        String cowName="红牛";//名称
        int height,weight,price;//声明牛参数
        RedCow(int h,int w,int p){
            height=h;//高
            weight=w;//重
            price=p;//价格
        }
        void speak(){
            System.out.print("偶是"+cowName+",身高:"+height+"cm,体重:"+weight+"kg,生活在:"+formName+"");
        }
        
    }
}
