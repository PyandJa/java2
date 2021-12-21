/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JDBC操作;
import java.sql.*;
import javax.naming.directory.DirContext;

/**
 * @author  qf
 * @date    2021-12-21 23:50:49
 * @version V1.0
 * @desc    
 */
public class 封装数据库连接 {
    public static void main(String[]args){
        Connection con;
        Statement sql;
        ResultSet rs;
        con = GetDBConnection.connectDB("student_infor", "root", "123456");
        if (con==null) {
            return; // 停止此方法
        }
        try {
            sql = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs = sql.executeQuery("select * from student"); // 查询学生表
            rs.last(); // 游标到最后
            int max= rs.getRow(); // 获取数据行数
            System.out.println("该表一共有"+max+"条记录，现在随机抽取4条记录：");
            int [] a = {1,2,5,7};
            for(int i:a){
                rs.absolute(i); // 控制游标移动到第i行
                String sno = rs.getString(1);
                String sname = rs.getString(2);
                String sex = rs.getString(3);
                System.out.printf("%s\t",sno);
                System.out.printf("%s\t",sname);
                System.out.printf("%s\t",sex);
            }
              con.close();
        } catch (SQLException e) { 
            System.out.println(e);
        }
      
    }
}
/**
 * 获取数据库类
 * @author qf
 */
class GetDBConnection{
    /**
     * 数据库连接对象
     * @param DBName 数据库名称
     * @param id 账户
     * @param p 密码
     * @return 连接对象
     */
    public static Connection connectDB(String DBName,String id,String p){
        Connection con = null; // 声明连接对象
        String uri = "jdbc:mysql://localhost:3306/"+DBName+"?useSSL=true"+  // 构造数据库连接字符串
                "&characterEncoding=utf-8"; 
        try {
             Class.forName("com.mysql.jdbc.Driver"); // 加载JDBC-MySQL驱动            
        } catch (Exception e) { }
        try {
            con = DriverManager.getConnection(uri,id, p);
        } catch (SQLException e) { }
        return  con;
 
    }
}
