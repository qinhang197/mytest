package cn.itcast.day06test;

import java.sql.SQLOutput;

/* 定义一个类 模拟手机事物
  属性  品牌  价格 颜色
  行为   打电话 发微信 拍照
  对应到类当中
  成员变量
  String  brand
  double price
  String color
  成员方法
  public void call(String who )
 */
public class phone {
    String brand;
    double  price;
    String color;
    public void call(String who){
        System.out.println("给"+who+ "打电话");
    }
    public  void sendmessage(){
        System.out.println("群发短信");
    }
}



//set必须有参数无返回  并且要和set 的人的类型 保持一致