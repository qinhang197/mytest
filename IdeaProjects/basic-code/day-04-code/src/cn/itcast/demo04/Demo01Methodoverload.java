package cn.itcast.demo04;
/*方法重载
 Overload
 只需要一个唯一的方法名称 就可以实现类似多个名称.
方法重载与下列因素有关:
1 参数因素不同
2.参数类型不同
3.要么参数的多类型顺序不同
方法重载与下列因素无关
1.与参数的名称无关              return x+y
2.与方法的返回值类型无关
public static double sum(int a, int b){
 return a+b+0.0 ;}  xxx
 3.
*/

import java.sql.SQLOutput;

public class Demo01Methodoverload {
    public static void main(String[] args) {
     //   System.out.println(sumSix(1,2,3,4));
        System.out.println(sum(10,20 ));
    }
    public  static int sum(int a,double b){
        return (int)(a+b);
    }

     public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c,int d){
        return  a+b+c+d;

    }
}
