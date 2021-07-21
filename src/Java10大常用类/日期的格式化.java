/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.Date;
import java.util.Locale;

/**
 * 常用的日期格式化方式
 * @author qf
 */
public class 日期的格式化 {
    public static void main(String[]args){
        
        Date notTime = new Date();
        
        String s1 = String.format("%tY年%tm月%td日",notTime,notTime,notTime);// 可以直接调用String类的fromat方法进行格式化
        String s2 = String.format("%tF",notTime);// 两种不同的日期格式
        System.out.println(s1);
        System.out.println(s2);
        
        String s3 = String.format("%tY年%<tm月%<td日", notTime);// 可以用<格式化同一日期
        String s4 = String.format("%tY-%<tm-%<td", notTime);// 两种不同的日期格式
        System.out.println(s3);
        System.out.println(s4);
        
        // 不同国家区域的星期格式：
        String s=String.format(Locale.JAPAN,"%tA(%<tF)",notTime); // 日本地区
        System.out.println(s);
    }
}
/*
1.%tY，将日期的年格式化为4位形式如2021
2.%ty，将日期的年格式化为2位形式(带前导0)如21，02
3.%tm，将日期的月格式化为2位形式(带前导0)如01是一月，13是支持农历所需的
4.%tp，将日期的日格式化为当前地区上午或下午的格式如US环境AM或PM
5.%td，将日期的日格式化为当前月中的第几天如(带前导0)如01，31
6.%tj，将日期的日格式化为当前年中的第几天(带前导0)如001,365
7.%tB，将日期的月格式化为当前环境的月全称如US环境January和February
8.%ta，将日期的月格式化为当前环境下的月份简称如US环境Jan和Feb
9.%tA，将日期的日格式化为当前环境下的星期几的全称如Sunday和Monday
10.%ta，将日期的日格式化为当前环境下的星期几的简称如Sun和Mon
11.%tH，将日期的时格式化为2位形式(带前导0，24小时)，即00~23
12.%tI，将日期的时格式化为2位形式(带前导0，12小时)，即0~12
13.%tM，将日期的分格式化为2位形式(带前导0)，即00~60
14.%tS，将日期的秒格式化为2位形式(带前导0)，即00~60
15.%tL，将日期的毫秒格式化为3位形式(带前导0)，即000~999
16.%tN，将日期毫秒中的微秒格式化为9位形式(带前导0)，即000000000~999999999
17.%tz，将日期与GMT(格林威治时间)的偏移量格式化为4位形式，如+0800，-0600
18.tZ，将日期所在时区格式化为标准缩写，如CST
19.组合日期格式符:
%tR等价于%tH:%tM
%tT等价于%tH:%tM:%S
%tr等价于%tI:%tM:%tS:%Tp(上下午标记%tP可能与地区有关)
%tD等价于%tm/%td/%ty
%tF等价于%tY-%tm-%td
%tc等价于%ta%tb%td%tT%tZ%tY，如星期四 二月 10 17:50:07 CST 2021
*
