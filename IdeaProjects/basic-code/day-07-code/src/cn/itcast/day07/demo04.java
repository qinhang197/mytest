package cn.itcast.day07;

import java.util.ArrayList;
//  向集合ArrayList 当中使用储存基本类型数据 应该使用基本类型对应得包装类.

// Integer String Boolean  Long Short Double Byte Character
public class demo04 {
    public static void main(String[] args) {
        ArrayList<String> listA= new ArrayList<>();
       // ArrayList<int> xx 只能是引用类型
        ArrayList<Integer> listB=new ArrayList<>();
        listB.add(100);
        listB.add(200);
        listB.add(300);

        System.out.println(listB);

        Integer j = listB.get(2);
        System.out.println(j);
        Integer i = listB.remove(0);
        System.out.println(i);
        //从jdk1.5开始 支持自动装箱 自动拆箱
        // 自动装箱 基本类型 -->包装类型
        //自动拆箱 包装类型-->基本类型


    }
}
