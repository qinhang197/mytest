package cn.itcast.day02;

public class demo06 {
    public static void main(String[] args) {
        int a =20, b=20;
        boolean bo=++a%3==0&&a++%3==0;
        System.out.println("bo的值"+bo);
        System.out.println("a的值:"+a);
        System.out.println("--------------------");
        boolean bo2=b++%3==0&&++b%3==0;
        System.out.println("bo2的值:"+bo2);
        System.out.println("b的值:"+b);

    }
}
