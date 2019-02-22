package xiti07;

import java.util.ArrayList;
import java.util.Random;

//选出最大的 3个数，如果有重复的数字，计为1个。
//定义 getNum方法，随机生成50个整数，范围【1-100】。
////定义 getMax方法，返回最大值的索引。
////代码实现，效果如图所示：
//开发提示：
//找到最大值后，将最大值从原集合移除，再寻找剩余元素中的最大值，直到最大的 3个数值都找到  remove
//[ 87,90,90.......x10]   最大的三个数为:[];
public class demo09 {

    public static void main(String[] args) {
        // System.out.print(list);
        ArrayList<Integer> max = new ArrayList<>();
          ArrayList<Integer> num=getNum();  //  将元素赋值给num
        for (int i = 0; i < 3; i++) {           //for循环循环三次最大值
            int index = getmax(num);            // 将最大值赋值给index
            Integer remove = num.remove(index);         // 移除
            if (max.contains(remove)) {                 //移除后
                i--;                    // 把getNum()
                continue;
            }
            max.add(remove);                    //添加移除的值放入max 循环3次
        }
         System.out.println(getNum());
        System.out.println("最大的三个数为:" + max);
    }
    public static ArrayList<Integer> getNum() {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 50; i++) {
            int n = r.nextInt(100) + 1;
            list.add(n);
        }
        return list;
    }
    public static int getmax(ArrayList<Integer> list) {    //用数组
       Integer max = list.get(0);                      //从数组的0号元素开始
        int index = 0;
        for (int i = 0; i < list.size(); i++) {         //循环数组的长度 如果最大值小于得到的数组元素
            if (max < list.get(i)) {
                max = list.get(i);                            // 替换元素赋值给max  return index
                index = i;
            }
        }
        return index;
    }

}