package cn.itcast.demo04;

public class Demo02MethodOverLoad {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)10,(short)20));
        System.out.println(isSame((int)10,(int)20));
        System.out.println(isSame((long)10L,(long)20L));
    }
    public static boolean isSame(byte a ,byte b){
        System.out.println("两个byte参数方法!执行");
        boolean same;
        if (a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }
    public static boolean isSame(short a,short b){
        System.out.println("两个short参数方法!执行");
        boolean same=a==b?true:false;
        return same;
    }
    public  static boolean isSame(int a,int b){
        System.out.println("两个int参数方法!执行");
        return a==b;

    }
    public  static boolean isSame(long a,long b){
        System.out.println("两个long参数方法!执行");
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}
