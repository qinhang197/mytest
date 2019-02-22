package cn.itcast.day06test;

public class phone1 {
    public static void main(String[] args) {
        phone one =new phone();
        System.out.println(one.brand); //null
        System.out.println(one.color);
        System.out.println(one.price);
        one.brand="苹果";
        one.price=6666;
        one.color="黑色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        one.sendmessage();
        one.call("老师");
    }

}
