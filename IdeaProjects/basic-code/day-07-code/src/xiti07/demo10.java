package xiti07;

import java.util.ArrayList;
import java.util.Random;

public class demo10 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();   //生成随机数
        Random r=new Random();
        for (int i = 0; i < 30; i++) {                  //循环三十次  循环30个数
            int  n=r.nextInt(100)+2;
            list.add(n);                                // 将获取的数组  赋值 到 list数组里

        }
        System.out.println("随机数:");             // 输出list 数组
        System.out.println(list);
        System.out.println("其中的质数为:");
        ArrayList<Integer> pNum = getPNum(list);        //返回值
        System.out.println(pNum);

        }
    public static ArrayList<Integer> getPNum(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int c = list.get(i);              // 获取的值和
            if (getnum(c) == true) {
                list1.add(c);
            }
        }
        return list1;
    }
        public  static boolean  getnum(int n){              //
            boolean b = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    b = false;
                }
            }
            return b;
        }


    }

