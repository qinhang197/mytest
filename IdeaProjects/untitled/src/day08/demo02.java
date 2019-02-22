package day08;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner qq = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入QQ号:");
            String QQ = qq.next();

            if (QQ.length() >=5 && QQ.length() < 12 && QQ.charAt(0)!= '0') {
                System.out.println("这个QQ号码是否正确" + true);
            } else {
                System.out.println("数据错误");
            }

        }

    }


}
