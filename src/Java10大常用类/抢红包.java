/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.Random;
/**
 * 这是一个简答的抢红包程序
 * @author qf
 */
public class 抢红包 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        RedEnvelope redEnvelope=new RandomRedEnvelope(5.20, 6);
        System.out.printf("以下用循环输出%d个人抢%.2f元的随机红包:\n", redEnvelope.remainPeople,redEnvelope.remainMoney);
        showProcess(redEnvelope);
    }
    /**
     * 该方法用处理抢红包过程并输出及结果
     * @param redEnvelope 抢红包对象
     */
    public  static void showProcess(RedEnvelope redEnvelope){
        double sum=0;
        while (redEnvelope.remainPeople>0) {
          double money=redEnvelope.giveMoney(); // 调用方法
          System.out.printf("%2f\t",money);
          sum+=money; // 提示XXX元红包的金额
        }
        String s=String.format("%.2f", sum);
        sum=Double.parseDouble(s); // 字符强制转换为double
        System.out.printf("\n%.2f元的红包被抢完了",sum);
    }
}
/**
 * 该抽象类定义了抢红包的各种属性及方法
 * @author qf
 * @since 有子类继承的
 * @version v1.0
 */
abstract class RedEnvelope{    
    /**
     * 红包金额
     */
    public double remainMoney; 
    /**
     * 抢红包人数
     */
    public int remainPeople; 
    /**
     * 抢到的红包金额
     */
    public double money; 
     /**
     * 抢红包抽象方法
     */
    public abstract double giveMoney(); // 具体的抢红包方法
}
class RandomRedEnvelope extends RedEnvelope{
    /**
     * 可以抢到的最小金额
     */
    double minMoney; 
     /**
     * 红包内金额用分表示
     */
    int integerRemainMoney; 
     /**
     * 给用户抢的钱
     */
    int randomMoney; 
    Random random; 

    /**
     * 具体的抢红包算法
     * @param remainMoney 红包金额
     * @param remainPeople 人数 
     */
    public RandomRedEnvelope(double  remainMoney,int remainPeople) {
        random = new Random();
        minMoney=0.1; // 保证用户可以抢到1分钱
        this.remainMoney=remainMoney;
        this.remainPeople=remainPeople;
        integerRemainMoney=(int)(remainMoney*100); // 把钱用分表示
        if(integerRemainMoney<remainPeople*(int)(minMoney*100)){
            integerRemainMoney = remainPeople*(int)(minMoney*100);
            this.remainMoney = (double)integerRemainMoney;
        }
        
    }
    /**
     * 定义了具体的抢红包算法
     * @return 用户抢到的钱(元)
     */
    @Override
    public double giveMoney(){
        if(remainPeople<=0){ // 没人抢时返回0
            return 0;
        }
        if(remainPeople==1){ // 只有一人抢时返回全部红包金额
            money = remainMoney;
            remainPeople--; // 人数减去
            return money; // 返回抢到的红包金额
        }
        randomMoney = random.nextInt(integerRemainMoney); // 生成随机金额
        if(randomMoney<(minMoney*100)){ // 给用户抢的钱少于1分时
            randomMoney = (int)(minMoney*100); // 保证用户至少能抢到1分
        }
        int leftOtherPeopleMoney = integerRemainMoney-randomMoney; // 红包内剩余的钱
        int otherPeopleNeedMoney = (remainPeople-1)*(int)(minMoney*100); // 保证其他人还能继续抢的最小金额
        if(leftOtherPeopleMoney<otherPeopleNeedMoney){
           randomMoney-=(otherPeopleNeedMoney-leftOtherPeopleMoney);
        }
        integerRemainMoney = integerRemainMoney-randomMoney;
        remainMoney = (double)(integerRemainMoney/100.0); // 把分转为元
        remainPeople--;
        money=(double)(randomMoney/100.0);
        return  money; // 返回用户抢到的钱(元)
    }
    
}

