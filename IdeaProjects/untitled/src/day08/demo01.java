package day08;

import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) {
        String str="字符串123反转";
        char []chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]+" ");
        }

    }
}
