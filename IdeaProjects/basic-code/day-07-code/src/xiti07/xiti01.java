package xiti07;

import java.util.Random;

public class xiti01 {
    public static void main(String[] args) {
        char [] array={'1','2','3','4','5','5','6','7','8','9','6','3'};
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print("随机验证码是:");
            for (int i1 = 0; i1 < 6; i1++) {
                int num=r.nextInt(array.length);  // 从数组的第0个开始取值
                System.out.print(array[num]);

            }
            System.out.println();
        }
    }
}
