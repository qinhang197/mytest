package cn.itcast.day07;

import java.util.Random;

public class demo03 {
    public static void main(String[] args) {
        Random r= new Random();
        int num =r.nextInt();
        System.out.println("随机数是:"+num);
    }
}
