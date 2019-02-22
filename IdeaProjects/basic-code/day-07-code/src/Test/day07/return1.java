package Test.day07;

import java.util.ArrayList;
import java.util.Random;

public class return1 {
    public static void main(String[] args) {
        ArrayList<Integer> blist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            blist.add(num);


        }
        ArrayList <Integer> slist=getslist(blist);//调用
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i));
            
        }
        int result=blist.size();
        System.out.println("长度为:"+result);




    }

    public static ArrayList<Integer> getslist(ArrayList<Integer> blist) {
        ArrayList<Integer> slist = new ArrayList<>();
        for (int i = 0; i < blist.size(); i++) {
            int num = blist.get(i);
            if (num % 2 == 0) {
                slist.add(num);
            }

        }
        return slist;
    }
}

