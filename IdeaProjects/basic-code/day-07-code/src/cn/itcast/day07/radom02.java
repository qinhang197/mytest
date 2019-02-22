package cn.itcast.day07;

import java.util.Random;
import java.util.Scanner;

public class radom02 {
    public static void main(String[] args) {
        Random r = new Random();   //生成随机数字
        int num = r.nextInt(10) + 1;    //随机数字大小的限制
        Scanner sc = new Scanner(System.in);    // 输入的scanner

        for (int i = 0; i < 10; i++)  {
           System.out.println("请输入你的猜测的数字:");
            int getnum = sc.nextInt();
            if (num < getnum) {
               System.out.println("数字太大了");
           } else if (num > getnum) {
               System.out.println("数字太小了");

           } else if (num == getnum) {
               System.out.println("恭喜你,猜中了!");
               break;
           }


       }
        System.out.println("游戏结束");

    }

}
