package cn.itcast.ti;

public class ti8 {
    public static void main(String[] args) {
        double s=30.0;
        System.out.println("摄氏度为:"+s+"°--华氏度为:"+hsd(s)+"°");
        double h=86.0;
        System.out.println("华氏度为:"+h+"°--摄氏度为:"+ssd(h)+"°");

    }
    public static double hsd(double s){
        return (9.0/5)*s+32;
    }
    public  static double ssd(double h){
        return  (h-32)/9.0*5;
    }
}
