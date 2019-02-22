package xiti07;

import java.util.ArrayList;
import java.util.Random;

public class xiti10 {
    public static void main(String[] args) {



    }

    public static ArrayList<Integer> getNum() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(99) + 2);
        }
        return list;
    }

    public static ArrayList<Integer> jude(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int c = list.get(i);
            if (iszhishu(c) == true) {
                list1.add(c);
            }
        }
        return list1;
    }

    public static boolean iszhishu(int n) {
        boolean b = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                b = false;
            }
        }
        return b;
    }
}
