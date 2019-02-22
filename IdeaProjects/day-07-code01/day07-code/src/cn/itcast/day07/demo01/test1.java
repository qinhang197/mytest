package cn.itcast.day07.demo01;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a=scanner.nextInt();
        System.out.println("请输入第二个数字:");
        int b=scanner.nextInt();
        System.out.println("请输入第三个数字:");
        int c=scanner.nextInt();
        int max = a > b ? a : b;
        max=max>c?max:c;
        System.out.println("最大值是:"+max);
    }
}
