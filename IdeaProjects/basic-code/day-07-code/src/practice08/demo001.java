package practice08;

import java.util.SplittableRandom;

public class demo001 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3,4};
            String result=from(array);
        System.out.println(result);
    }

    public static String from(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] + "#";
            }
        }return str;
    }
}
//09