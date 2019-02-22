package cn.itcast.day02;

public class demo03 {
    public static void main(String[] args) {
        char ch1='J',
        ch2='J'+32;
        System.out.println(ch2);
        char ch3='A';
        System.out.println((char)ch2+32);
        int a=100;
        double b=3.5;
        System.out.println("sum3的值:"+(a+b));
        int sum;
        sum=a+(int)b;
        System.out.println("sum3的整数部分:"+sum);
        double a1=5.8;
        int b1=300;
        int mul4=(int) (5.8*300);
        System.out.println("mul4的整数部分值"+mul4);


    }
}
