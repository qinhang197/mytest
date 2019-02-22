package cn.itcast.demo03;

import java.util.ArrayList;
import java.util.Random;

public class xiti4 {
    public static void main(String[] args) {
        System.out.println(getNumList());
        printCount(getNumList());

    }

    //   定义类型           方法名
    public static ArrayList<Integer> getNumList() {
        Random random = new Random();  //随机变量
        ArrayList<Integer> list = new ArrayList<>();  //数组名
        for (int i = 0; i < 100; i++) {  // 随机循环
            list.add(random.nextInt(10) + 1); // random.nextInt(10);     //随机赋值
        }
        return list;
    }
//输出随机数字 和随机数字的范围值
    //list.set(i, c);
    //list.set(i,c)此种形式适合已经确定Size范围的集合，若运行则报错超过边界值0，
    // 因为初始Index 0 out-of-bounds for length 0


    public static void printCount(ArrayList<Integer> list) {
        for (int i = 1; i <= 10; i++) {
            int c = 0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (i == list.get(i1)) {
                    c++;

                }
            }
            System.out.println("数字" + i + "------" + c + "次");
        }
    }
}
