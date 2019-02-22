package Test.day07;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRturn {
    public static void main(String[] args) {
        ArrayList<Integer> blist = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            blist.add(num);  //将数据放入大集合

        }
        ArrayList<Integer> slist = getslist(blist);
        for (int i = 0; i < slist.size(); i++) {
            int result = slist.get(i);
            System.out.println(result);



        } int size = blist.size();
        System.out.println("数量为:" + size);
    }
    // 这个方法 接收大集合参数  返回小集合结果

    public static ArrayList<Integer> getslist(ArrayList<Integer> blist) {
        //创建一个小集合  用来装偶数结果
        ArrayList<Integer> slist = new ArrayList<>();
        for (int i = 0; i < blist.size(); i++) {
            int num = blist.get(i);
            if (i % 2 == 0) {
                slist.add(num);

            }
        }
        return slist;

    }
}