/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.StringTokenizer;
/**
 * <code>该类不使用正则表达式作为分隔标记</code>
 * @author 13340
 */
public class StringTokenizer类 {
    public static void main(String[]args){
        StringTokenizer fenxi=new StringTokenizer("You,are,welcome");         // 使用默认的分隔标记：回车，换行，分隔，制表空格，进纸符
        StringTokenizer fenxito=new StringTokenizer("You#*are##welcome","#*");// 使用给定参数的分隔标记：#或*，任意序列
        String s="You are Welcome(thank you),nice to meet you";
        StringTokenizer fenxis=new StringTokenizer(s, "() ,"); // () 使用空格 逗号 作为分隔标记
        System.out.println(fenxis.nextToken());   // nextToken函数逐个获取字符序列中的单词
        System.out.println(fenxis.countTokens()); // countTokens函数获取分析器中计数变量的值
        
        String shoppingReceiptString="牛奶：8.5元,香蕉 3.6元，酱油:2.8元";
        StringTokenizer类 st = new StringTokenizer类();
        System.out.println("购物清单:"+shoppingReceiptString+"");       
        double sum=st.getPriceSum(shoppingReceiptString);
        int amount=st.getGoodsAmount(shoppingReceiptString);
        double aver=st.getAverPrice(shoppingReceiptString);
        System.out.printf("购物总价%-2.2f元",sum);
        System.out.printf("\n商品数目:%d,平均价格:%-2.2f元",amount,aver); // -7.2f:负号表示左对齐,7表示占7个字符宽度,2代表小数位数为2
       //++*rssppu8wN
    
    }
    /**
     * 求所购物品清单价格的总数
     * @param  shoppingReceiptString:表示商品清单字符串
     * @return 返回求和总数
     */
    public double getPriceSum(String shoppingReceiptString){
        String regex="[^0123456789.]+"; //匹配任意非数字字符序列
        shoppingReceiptString=shoppingReceiptString.replaceAll(regex,"#"); // 对非任意字符以#号标记
        StringTokenizer fenxi = new StringTokenizer(shoppingReceiptString, "#"); // 以#号进行分隔
        double sum=0;
        // 对字符串中的数字进行求和：
        while (fenxi.hasMoreElements()) { // hasMoreElements函数用于判断字符串的计数变量是否大于0或小于0
            String item = fenxi.nextToken();
            double price=Double.parseDouble(item);
            sum+=price;
        }
        return sum;
    }
    /**
     * 求所购物品清单价格的平均数
     * @param shoppingReceipt:表示商品清单字符串
     * @return 返回平均值
     */
    public double getAverPrice(String shoppingReceipt){
        double priceSum=getPriceSum(shoppingReceipt);// 调用方法
        int goodsAmunt=getGoodsAmount(shoppingReceipt); //调用方法
        return priceSum/goodsAmunt;
    }
    /**
     * 求所购物品清单种类数
     * @param shoppingReceipt :表示商品清单字符串
     * @return  返回商品数目
     */
    public int getGoodsAmount(String shoppingReceipt){
        String regex = "[^0123456789.]+"; //  正则表达式匹配任意非数字字符序列
        shoppingReceipt = shoppingReceipt.replaceAll(regex, "#"); // 对非任意字符以#号标记
        StringTokenizer fenxi = new StringTokenizer(shoppingReceipt,"#"); // 以#号分隔出特点内容
        int amount = fenxi.countTokens(); // 获取分隔出的信息的数目
        return amount;
    }
    
}
