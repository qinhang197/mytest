package cn.itcast.ti;

public class F {
    public static void main(String[] args) {
        double s=30;
        double h=86;
        System.out.println("摄氏度为:"+s+"°--华氏度为:"+h);
        System.out.println("华氏度为:"+h+"°--摄氏度为:"+s);
    }
    public static double hsd(double s){
        return (9.0/5)*s+32;
    }
    public  static double ssd(double h){
        return (h-32)/9.0*5;
    }
}
