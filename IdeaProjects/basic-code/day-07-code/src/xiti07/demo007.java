package xiti07;

import java.util.ArrayList;

public class demo007 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();   // 添加数组
        list.add("0");              //  添加数据到数组中
        list.add("1");
        list.add("2");
        System.out.println("添加元素后:");         //输出元素
        System.out.println(list);

        System.out.println("获取元素:");            //删除元素
        System.out.println(list.remove(2));
        System.out.println("获取元素后:");
        System.out.println(list);                   //  获取元素


    }

}






//public  static void print(ArrayList<String>list){
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            String name=list.get(i);
//
//
//
//        }
//    }