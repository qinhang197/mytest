package cn.itcast.day07;

import java.util.Random;

public class radom {
    public static void main(String[] args) {
        Random r= new Random();
        System.out.print("您的验证码是:");
        for (int i = 0; i <6; i++) {
            int num = r.nextInt(10);
            System.out.print(num);


        }
    }
}
