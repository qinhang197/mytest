package cn.itcast.demo03;

import cn.itcast.ti.A;

import java.util.ArrayList;
import java.util.Random;

public class demo04 {
    public static void main(String[] args) {
        ArrayList<Integer> numlist=getNumList();
        //统计字符数组的出现次数
        printCount(numlist);
    }
    public static void printCount(ArrayList<Integer> list){
        int [] count=new int[10];
        //对应保存数字出现的次数.
        for (int i = 0; i < list.size(); i++) {
            int c=list.get(i);
            count[c-1]++;


            } for (int i = 0; i < count.length; i++) {
                System.out.println("数字:"+(i+1)+"--"+count[i]+"次");

        }
    }
    public static ArrayList<Integer> getNumList(){
        ArrayList<Integer> list=new ArrayList<>();
        Random r= new Random();
        for (int i=0;i<100;i++){
            int x=r.nextInt(10)+1;
            list.add(x);
        }return list;
    }
    
}
