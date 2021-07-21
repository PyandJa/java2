/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java10大常用类;
import java.util.Date;
import java.util.Calendar;
/**
 * 对日期和时间进行获取和处理
 * @author qf
 */
public class Data和Calendar类 {
    public static void main(String[]args){
         //Date类：
          Date nowTime = new Date();   // 使用无参构造函数
          System.out.println(nowTime); // Date重写了Object的toString方法
          
          // 北京时间与标准格林威治时间差8个小时：
          Date date1 = new Date(1000); // 获取公元后的时间1000毫秒
          Date date2=new Date(-1000);  // 获取公元前的时间1000毫秒
          long s= System.currentTimeMillis(); // 获取系统当前时间毫秒⏲
          //System.out.println(s); // 公元1970-1-1：08到现在所走过的毫秒数
          
          //Calendar类：
          Calendar calendar =  Calendar.getInstance(); // 初始化一个日历对象
          calendar.setTime(new Date());
          int year=calendar.get(Calendar.YEAR), // 获取年月小时星期等,参数由Calendar静态常量指定
          moth=calendar.get(Calendar.MONTH)+1,     // 月
          day=calendar.get(Calendar.DAY_OF_MONTH), // 日
          hour=calendar.get(Calendar.HOUR_OF_DAY), // 时
          minute=calendar.get(Calendar.MINUTE),    // 分
          seconde=calendar.get(Calendar.SECOND);   // 秒
          System.out.println("现在时间是:");
          System.out.print(""+year+"年"+moth+"月"+day+"日");
          System.out.println(""+hour+"时"+minute+"分"+seconde+"秒");
          
          //利用set方法计算天数：
          int y=2012,m=9,d=1;
          calendar.set(y,m-1,d); // 将📅翻到2012年9月1日,注意m-1=8表示9月
          long time1=calendar.getTimeInMillis(); // 返回公元1970-1-1:8：00的毫秒⏲
          y=2021;
          m=7;
          d=1;
          calendar.set(y,m-1,d);// 将📅翻到2016年7月1日,注意m-1=6表示7月
          long time2=calendar.getTimeInMillis(); // 返回毫秒数
          long subDay=(time2-time1)/(1000*60*60*24); // 计数天数
          System.out.print(""+new Date(time2)+"");
          System.out.print("与"+new Date(time1)+"");
          System.out.println("相隔"+subDay+"天");
          
          // 输出日历：
          CalendarBean cb =new CalendarBean();
          cb.setYear(2021);
          cb.setMonth(7);
          String[] a = cb.getCalendar(); // 返回号码的一维数组
          char[]str="日一二三四五六".toCharArray(); // 转换为数组
          for (char c:str) {
            System.out.printf("%3c", c);
          } 
          for (int i = 0; i <a.length; i++) { // 输出数组a
              if (i%7==0) {
                  System.out.println(""); // 换行
              }
               System.out.printf("%4s", a[i]);
            }        
    }    
}
    /**
     * 该类用于生成和处理日历信息
     * @author 覃锋
     */
class CalendarBean{
        int year=0,month=0;
        public void setYear(int year){
            this.year=year;
        }
        public void setMonth(int month){
            this.month=month;
        }
        public String[]getCalendar(){
            String[]a=new String[42];
            Calendar rili = Calendar.getInstance();// 初始化一个日历对象
            rili.set(year, month-1,1);
            int weekDay=rili.get(Calendar.DAY_OF_WEEK)-1;// 计数出1号的星期
            int day=0;
            // 设置有31天的月份：
            if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
                day=31;
            }
            // 设置有30天的月份：
            if (month==4||month==6||month==9||month==11) {
                day=30;
            }
            // 设置润年和平年2月份的天数:
            if (month==2) {
                if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
                    day=29; // 是润年
                }
                else{
                    day=31; // 是平年
                }
            }
            for (int i = 0; i < weekDay; i++) {
                a[i]=" ";
            }
            for (int i = weekDay,n=1; i < weekDay+day; i++) {
                a[i]=String.valueOf(n);
                n++;
            }
            for (int i = weekDay+day; i < a.length; i++) {
                a[i]=" ";
            }
            return a;
        }
    }
