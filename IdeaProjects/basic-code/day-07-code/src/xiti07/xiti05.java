package xiti07;

import cn.itcast.day07.list;

import java.util.ArrayList;
import java.util.Random;

public class xiti05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getScoreList();
        int a = 0, b = 0, c = 0, d = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<=100 && list.get(i) >= 80) {
                a++;
            } if (list.get(i) < 80 && list.get(i) >= 60) {
                b++;
            } else if (list.get(i)< 60 && list.get(i) >= 40) {
                c++;
            } else if (list.get(i) < 40 && list.get(i) >= 0) {
                d++;
            }
        }System.out.println("100分--80分:" + a + "人");
        System.out.println("79分--60分:" + b + "人");
        System.out.println("59分--40分:" + c + "人");
        System.out.println("39分--0分:" + d + "人");



    }

    public static ArrayList<Integer> getScoreList() {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int num = r.nextInt(100)+1;
            list.add(num);

        }
        return list;
    }


}
