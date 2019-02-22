package day08;

import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入大字符串:");
        String big= sc.nextLine();
        Scanner sc1=new Scanner(System.in);
        System.out.println("请输入小字符串");
        String small=sc1.nextLine();
        String resultstr=big.replace(small,"");
         int count =(big.length()-resultstr.length())/small.length();
        System.out.println("小字符串heima,在大字符串中出现"+count+"次");


    }
}
