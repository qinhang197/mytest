package lianxi07;

public class test {
    public static void main(String[] args) {
        rectangle rectangle=new rectangle(20,5,0);
        circle circle=new circle(0,0,5);
        circle.zhouchang();
        System.out.println("长方形的周长为:"+rectangle.zhouchang());
        System.out.println("长方形的面积为:"+rectangle.mianji());
        System.out.println("圆的周长为:"+circle.zhouchang());
        System.out.println("圆的面积为:"+circle.mianji());

    }
}
