package xiti07;
/*  定义一个数组

 */

import java.util.ArrayList;

public class a{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        //创界了arraylist集合
        System.out.println(list);
        list.add(123);
        System.out.println(list);
        list.add(456);
        System.out.println(list);
       Integer name= list.get(0);
        System.out.println(name);
    }
}




