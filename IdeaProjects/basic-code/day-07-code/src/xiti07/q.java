package xiti07;

import java.util.Random;
public class q {
    public static void main(String[] args) {
        char[] array = {'1', 'A', 'c', '3', '5', '6', 'f', 'Q'};
        Random a = new Random();        for (int i = 0; i < 10; i++) {
            System.out.print("随机验证码：");
            for (int i1 = 0; i1 < 6; i1++) {
                int c = a.nextInt(array.length);
                System.out.print(array[c]);
            }
            System.out.println();
        }

    }
}
