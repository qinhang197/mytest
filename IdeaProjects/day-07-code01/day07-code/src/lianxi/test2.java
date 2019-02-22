package lianxi;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        Random r=new Random();
            for (int i = 0; i < 100; i++) {
            System.out.print(r.nextInt(10)+1+" ");
        }
    }
}
