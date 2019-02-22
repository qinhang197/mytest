package day08;

import java.util.Scanner;


public class demo04 {
    public static void main(String[] args) {
        Scanner str1=  new Scanner(System.in);
        System.out.println("请输入源字符串:");
        String s1 = str1.nextLine();
        Scanner str2=  new Scanner(System.in);
        System.out.println("请输入要删除的字符串:");
        String s2= str2.nextLine();
        String resultstr=s1.replace(s2,"");
        System.out.println("删除ja后的字符串:"+resultstr);
        int count =(s1.length()-resultstr.length())/s2.length();
        System.out.println("删除了总共"+count+"个ja");
    }


}
