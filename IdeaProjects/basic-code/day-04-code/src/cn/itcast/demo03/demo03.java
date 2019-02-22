package cn.itcast.demo03;

import java.util.ArrayList;
import java.util.Random;

public class demo03 {
    public static void main(String[] args) {
        printCount(getNumlist());

    }

    public static ArrayList<Integer> getNumlist() {
        Random r = new Random();//  创建随机数对象
        ArrayList<Integer> list = new ArrayList<>(); //创建数组对象
        for (int i = 0; i < 100; i++) {   //100个f  or 循环
            list.add(r.nextInt(10) + 1);    //添加随机数对象 在for循环里 循环100次 范围值从  1开始 最大不超过10
        }
        return list;         //  返回list
    }
    public static void printCount(ArrayList<Integer> list) {   //  定义printcount方法 参数 数组对
        for (int i = 1; i < 10; i++) {    //  for循环 循环 10行
            int num = 0;
            for (int i1 = 0; i1 < list.size(); i1++) {   //   定义i1  小于数组的长度
                if (i == list.get(i1)) {    //如果  i=   list 获取的数字 第一行是1
                    num++;                  //  这个数字加1
                }
            }
            System.out.println("数字" + i + "--------" + num + "次");   //输出


        }
    }
}
////  第四 .