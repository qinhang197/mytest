package practice08;

import java.util.Scanner;

/*
键盘输入一个字符串 并且统计其中各种字符出现的次数
种类有  大写字母 小写字母 数字 其他
 */
public class demo002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = sc.next();
        int up = 0;
        int lo = 0;
        int num = 0;
        int other = 0;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];//当前单个字符
            if ('A' <= ch && ch <= 'Z') {
                up++;
            } else if ('a' <= ch && ch <= 'z') {
                lo++;
            } else if ('0' <= ch && ch <= '9') {
                num++;
            } else {
                other++;
            }
        }
        System.out.println("大写字母有:" + up);
        System.out.println("小写字母有:" + lo);
        System.out.println("数字有:" + num);
        System.out.println("其他字符有:" + other);

    }

}

