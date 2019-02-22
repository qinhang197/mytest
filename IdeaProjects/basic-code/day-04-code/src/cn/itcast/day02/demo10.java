package cn.itcast.day02;

public class demo10 {
    public static void main(String[] args) {
            printString();
    }
     public  static void  printString (){
        String str;
        int num;
        num=69;
        str=(num%2==0)?"偶数":"奇数";
         System.out.println("num:"+num+"是"+str);
     }
}
