package day08;

import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码:");
        String sc = scanner.next();
        System.out.print("密码是否合法:  ");
        System.out.println(isSame(sc));

    }

    public static boolean isSame(String num) {
        if (num.length() < 8) {
            return false;
        }
        int count = 0;
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
                if ((ch < '0' || ch > '9') && (ch < 'a' || ch > 'z') && (ch < 'A' || ch > 'Z')) {
                    return false;
                }if (count < 2) {
                        return false;
            }

            }return true;


        }
    }
