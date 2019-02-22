package cn.itcast.day07;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        // Scanner sc =new Scanner(System.in);
        // int num = sc.nextInt();
        //普通使用方式
        //int num= new Scanner(System.in).nextInt();
        // System.out.println("输入的是:"+num);
       // Scanner sc = new Scanner(System.in);
       // methodParam(sc);
       // methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int num =sc.nextInt();
        System.out.println("输入的是:"+num );
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输出的结果为:"+num);

    }

    public static Scanner methodReturn() {
        //Scanner sc =new Scanner(system.in);
        //return sc;
        return new Scanner(System.in);

    }
}
