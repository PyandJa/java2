/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package 输入输出流;
import java.io.*;


/**
 * randomAccessFilele类创建的流称为随机流，该流既不是
 * InputStream类的子类，也不是OutputStram类的子类
 * 但是该类既可以作为流的源，也可以作为流的目的地。
 * 总的来说，当准备对一个文件进行读写操作时使用即可。
 * 该类的常用方法：P293 表10.1
 * --------------!! 需要注意------------
 * ：readLine()方法在读取含有ASCII字符文件(如含有汉字的文件)时
 * 会出现乱码现象，需要把该方法要读取的字符串用“iso-8859-1”编码从新编码
 * 存放到byte数组中，然后用该机器的默认编码将该数组转换为字符串。
 * @author  qf
 * @date    2021-11-29 23:32:33
 * @version V1.0
 * @desc    
 */
public class 随机流 {
    public static void main(String[]args){
        RandomAccessFile inAndOut = null;
        int data[] = {1,2,3,4,5,6,7,8,9,10};
        try {
            inAndOut = new RandomAccessFile("tom.dat", "rw"); // 该构造方法参数为:文件名，rw:可读写 or r:只读
            for (int i = 0; i < data.length; i++) {
                inAndOut.writeInt(data[i]);
            }
            for (long i = data.length-1; i>=0 ; i++) {
                inAndOut.seek(i*4); // 一个int型数据占四个字节，inAndOut从文件的第36个字节读取后面的一个整数。
                System.out.printf("\t%d", inAndOut.readInt()); // 每隔四个字节往前读取一个整数。
            }
            inAndOut.close(); // 关闭文件
        } catch (Exception e) {
            
        }
    }
}
/**
 * 使用readLine读取文件
 * @author qf
 */
class readLineShiYong{
    public static void ShiYong(){
        RandomAccessFile in =null;
        try {
            in = new RandomAccessFile("a.txt", "rw");
            long length = in.length(); // 获取文件的长度
            long position = 0; 
            in.seek(position); // 将读取位置定位到文件的起始
            while (position<length) {                
                String str = in.readLine();
                byte b[] = str.getBytes("iso-8859-1"); // 重新编码
                str = new String(b);
                position = in.getFilePointer();
                System.out.println(str);
               
            }
        } catch (IOException e) {
        }
    }
    
}