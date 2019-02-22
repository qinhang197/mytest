package lianxi1;

import java.util.Arrays;
import java.util.Scanner;

public class lianxi3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符:");
        String str = sc.next();//字符串
       // String  str="dsadsagre1gre5ghrhkyui186";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
    }

}
