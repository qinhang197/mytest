package day08;

import java.util.Arrays;

public class calss1 {
    public static void main(String[] args) {
        String  str="qw68y4kj91g2hmnyt8rb7bcg";
        char [] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);

        }
    }

}
