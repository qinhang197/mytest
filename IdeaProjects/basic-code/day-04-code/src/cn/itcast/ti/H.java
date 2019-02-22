package cn.itcast.ti;

public class H {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println(" a和b是否相等:"+isSame(a,b));
        System.out.println(" a和b是否相等:"+isSame((short)20,(short)20));
        System.out.println("a和b是否相等:"+isSame(10,5));
    }
    public static boolean isSame (int a,int b){
         boolean same;
        if(a==b){
            same=true;
        }else {
            same=false;
        }return same;
    }
    public static  boolean isSame(short a,short b){
        boolean same1;
        if (a==b){
            same1=true;
        }else {
            same1=false;
        }return same1;

    }
    public static  boolean isSame(byte a,byte b){
        boolean same2;
        if (a==b){
            same2=true;
        }else {
            same2=false;
        }return same2;

    }


}
