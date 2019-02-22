package Test.day07;

import java.util.ArrayList;
import java.util.Random;

public class test01 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);


            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));


        }System.out.println(list.get(2));

    }

}
