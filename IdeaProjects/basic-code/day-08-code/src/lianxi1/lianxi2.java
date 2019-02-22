package lianxi1;

import java.util.Scanner;

public class lianxi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String s = sc.next();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if ((chars[i] >= 'A') && (chars[i] <= 'Z')) {
                count1++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                count2++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                count3++;
            } else {
                count4++;
            }
            System.out.println("大写字母出现的次数:" + count1);
        }
        System.out.println("小写字母出现的次数:" + count2);
        System.out.println("数字出现的次数:" + count3);
        System.out.println("其他字符出现的次数:" + count4);
    }
}
