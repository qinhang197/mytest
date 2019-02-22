package xiti07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class demos09{
public static void main(String[] args) {
        ArrayList<Integer> num = getNum();
        Collections.sort(num);
        Collections.reverse(num);
        System.out.println(num);
        ArrayList<Integer> maxList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
        int index = getMax(num);
        Integer remove = num.remove(index);
        if (maxList.contains(remove)){
        i--;

        continue;
        }
        maxList.add(remove);
        }
        System.out.println("最大的三个数为:"+maxList);

        }

    /*
    返回最大值的角标
     */
public static int getMax(ArrayList<Integer> list ){
        Integer max= list.get(0);
        int index = 0 ;

        for (int i = 1; i < list.size(); i++) {
        Integer integer = list.get(i);
        if (integer > max){
        max = integer;
        index = i;
        }
        }
        return index;
        }

public static ArrayList<Integer> getNum( ){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
        int n = r.nextInt(100)+1;
        list.add(n);
        }
        return  list;
        }
        }
