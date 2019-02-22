package cn.itcast.day07;

//常用方法  public boolean (E e ) 向集合中添加元素, 参数的类型和泛型一致;
//public E get(int index): 从集合中获取元素,参数是索引编号  返回值就是对应的元素;
// 备注 : 对于arraylist集合来说, add添加动作一定是成功的,所以返回值可用可不用.
//对于其他add 来说 add添加动作不一定成功 .
//public E remove(int  index):从集合当中删除 删除元素 参数是索引编号 返回值就是被删掉的元素.
// public int size();   获取集合的尺寸长度,返回值是集合中包含的元素个数.

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String>list= new ArrayList<>();
        System.out.println(list);

        boolean success= list.add("柳岩");
        System.out.println(list);
        System.out.println("添加的数据成否成功:"+success);



        list.add("高圆圆");
        list.add(" 赵又廷");
        list.add(" 赵丽颖 ");
        list.add(" 冯绍峰 ");
        System.out.println(list);
      String  name=   list.get(2);
        System.out.println("第二号索引位置:"+name);
        String name1=list.remove(3);
        System.out.println("删除的第3号位置:"+name1);
        System.out.println(list);
         int size =list.size();
        System.out.println("集合的长度是:"+size);
    }
}
