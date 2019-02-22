package xiti07;


import java.util.Random;

public class Random001 {
        public static void main(String[] args) {
            char [] array={'a','B','C','D','0','1','2','3','4','5','6','7','8','9','E','f','g','J','Z','y','l'};
            Random r=new Random();  //随机数字
            for (int i = 1; i <10; i++) {     // 输出了几行
                System.out.print("随机验证码:");
                for (int j = 0; j < 5; j++) {   //限制的数组的长度
                    int num=r.nextInt(array.length); // 定义返回的值
                    System.out.print(array[num]);  //输出返回的值
                }System.out.println();

            }

        }

    }

