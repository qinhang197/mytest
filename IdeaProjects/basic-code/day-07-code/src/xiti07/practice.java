package xiti07;

import java.util.ArrayList;
import java.util.Random;

public class practice {
    public static void main(String[] args) {
        ArrayList<Integer> blist = new ArrayList<>();      //  创建bilist集合用来装20个随机数
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            Integer num = r.nextInt(10) + 1;              //随机生成1-10 20个随机数字 ;
            blist.add(num);
        }
        System.out.println("20次循环随机数字为:"+blist);
        System.out.print("偶数的随机数字为:");
        ArrayList<Integer> result=getSmalllist(blist);///??????????????????
        System.out.println(result);
        System.out.println(result.size());
    }
    //                    类型                  方法          参数
    public static ArrayList<Integer> getSmalllist(ArrayList<Integer> blist) {
        //创建一个小集合
        ArrayList<Integer> smallList = new ArrayList<>();                   //   创建一个小集合
        for (int i = 0; i < blist.size(); i++) {                           //获取大集合的值
            int num = blist.get(i);   //  获取的第N个元素的数组               // 判断是否为偶数
            if (num % 2 == 0) {
                smallList.add(num);                                             //添加到小数组中

            }
        }
        return smallList;                                  ///返回到了哪里                     // 返回数组

    }
}
