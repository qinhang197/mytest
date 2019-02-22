package lianxi2;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("张三丰");
        list.add("宋远桥");
        list.add("张无忌");
        list.add("张翠山");
        System.out.println(list);
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i==list.size()-1){
                System.out.print(list.get(i)+"}");
            }else {
                System.out.print(list.get(i)+"@");
            }
        }
    }
}
