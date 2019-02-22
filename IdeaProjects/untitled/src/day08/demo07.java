package day08;

import java.util.Arrays;
import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入回文数:");
        String str1 = str.nextLine();
        System.out.println(isSame(str1));
    }

    public static boolean isSame(String str2) {
        int start = 0;
        int end = str2.length() - 1;
        while (start < end) {
            if (str2.charAt(start) != str2.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}


