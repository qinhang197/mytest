package lianxi2;

import java.util.ArrayList;
import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        ArrayList<Integer> biglist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            biglist.add(num);

        }
        ArrayList<Integer> smalllist = getsmalllist(biglist);
        for (int i = 0; i < smalllist.size(); i++) {
            int result = smalllist.get(i);
            System.out.println(result);
        }
        System.out.println("偶数的个数" + smalllist.size());
    }

    private static ArrayList<Integer> getsmalllist(ArrayList<Integer> biglist) {
        ArrayList<Integer> smalllist = new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num = biglist.get(i);
            if (num % 2 == 0) {
                smalllist.add(num);
            }
        }
        return smalllist;
    }
}
