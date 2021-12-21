/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC操作;
import java.sql.*;
import Java10大常用类.Random类.*;

/**
 * @author  qf
 * @date    2021-12-20 23:53:20
 * @version V1.0
 * @desc    
 */
public class 连接mysql {
    public static void main(String[]args){
        ExEcMysql sql = new ExEcMysql();
        sql.ExEcTable("sc");
    }
}

class ExEcMysql{
    /**
     * 查询表
     * @param table 
     */
    public void ExEcTable(String table){
        Connection con = null; // 连接对象
        Statement sql; // sql语句对象
        ResultSet rs; // 查询对象
        try {
            Class.forName("com.mysql.jdbclDriver"); // 加载JDBC-MySQL驱动
        } catch (Exception e) {}
        String uri = "jdbc:mysql://localhost:3306/student_infor?user=root&password=123456&useSSL=true"+  // 构造数据库连接字符串
                "&characterEncoding=utf-8"; 
        try {
            con = DriverManager.getConnection(uri); // 连接代码
        } catch (SQLException e) {}
        try {
            sql = con.createStatement(); // 创建slq语句对象
            rs = sql.executeQuery("select*from "+table+""); // 查询student表
           
            
            while(rs.next()){ // 循环控制游标，直到读取完表内所有信息。
                String Sno = rs.getString(1);   
                String Sname = rs.getString(2); // 内部全部写死，程序缺乏灵活性。
                String Ssex = rs.getString(3);
              
                
                System.out.printf("%s\t",Sno);
                System.out.printf("%s\t",Sname);
                System.out.printf("%s\t",Ssex);
              
                System.out.println("\t");
            }
            con.close(); // 关闭连接
            
        } catch (Exception e) {
        }      
    }
}