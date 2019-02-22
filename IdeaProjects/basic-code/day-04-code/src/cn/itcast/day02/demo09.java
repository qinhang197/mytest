package cn.itcast.day02;

public class demo09 {
    public static void main(String[] args) {
        printNum();
    }
    public  static void printNum(){
        int i=10,j=20;
        j+=i/5;
        int k=j;
        System.out.println("i:"+i+"j:"+j+"k"+k);
    }
}
