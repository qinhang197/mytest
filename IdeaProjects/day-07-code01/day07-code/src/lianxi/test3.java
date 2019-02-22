package lianxi;

import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int nums = r.nextInt(100) + 1;


        while (true) {
            System.out.println("请输入一个数字:");
            int num = sc.nextInt();
            if (num > nums) {
                System.out.println("太大了!");

            } else if (num < nums) {
                System.out.println("太小了!");

            } else if (num == nums) {
                System.out.println("恭喜你猜对了!");
                break;
            } else {
                System.out.println("数据错误!");

            }
        }
        System.out.println("游戏结束!");

    }
}

