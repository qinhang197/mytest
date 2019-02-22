package cn.itcast.day04;

public class demo03 {
    public static void main(String[] args) {
            int a=10,b=10;
            printNum(a,b);
            doubling(a,b);
            printNum(a,b);
        System.out.println("-------------------");
        a=doubling(a);
        b=doubling(b);
        printNum(a,b);

    }
    public static  void   printNum(int iVar1,int iVar2){
        System.out.print("iVar1:"+iVar1);
        System.out.println("iVar2:"+iVar2);

    }
    public static void  doubling (int r,int p){
        r*=2;
        p*=2;
        System.out.println("翻倍:r="+r+",p="+p);

    }
    public  static int doubling(int r){
        r*=2;
        return r;
    }


}
