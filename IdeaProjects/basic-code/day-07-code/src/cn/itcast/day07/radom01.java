package cn.itcast.day07;

import java.util.Random;

public class radom01 {
    public static void main(String[] args) {
        int n=5;
        Random r =new Random();
        for (int i = 0; i < 5; i++) {
            int result =r.nextInt(5)+1;
            System.out.println(result);
        }


    }
}
