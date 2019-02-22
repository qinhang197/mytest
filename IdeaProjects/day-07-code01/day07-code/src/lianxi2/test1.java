package lianxi2;

import java.util.ArrayList;
import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int r1 = r.nextInt(33)+1;
            list.add(r1);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



    }
}
