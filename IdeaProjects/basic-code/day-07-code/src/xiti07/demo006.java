package xiti07;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Random;

public class demo006 {

    public static void main(String[] args) {
            getpuke(5);
            getpuke(55);

    }

    public static String[] puke1() {
        String[] hs = {"梅花", "方片", "红桃", "黑桃"};
        String[] ds = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
        String puke[] = new String[54];
        int index = 0;//此语句控制
        for (int i = 0; i < hs.length; i++) {
            for (int i1 = 0; i1 < ds.length; i1++) {
                puke[index] = hs[i] + ds[i1];
                index++;
            }
        }
        puke[52] = "小鬼";
        puke[53] = "大鬼";
        return puke;
    }

    public static void getpuke(int num) {
        System.out.println("随机" + num + "张牌");
        if (num <= 54) {
            ArrayList<String> list = new ArrayList<>();
            String[] a = puke1();
            for (int i = 0; i < puke1().length; i++) {
                list.add(a[i]);
            }

            for (int i = 0; i < num; i++) {
                Random r = new Random();
                int c = r.nextInt(54);
                System.out.print(list.get(c) + "");

            }
            System.out.println();
        } else {
            System.out.println("超出范围");

        }
    }
}
