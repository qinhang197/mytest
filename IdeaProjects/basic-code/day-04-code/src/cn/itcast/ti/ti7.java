package cn.itcast.ti;

public class ti7 {
    public static void main(String[] args) {
        System.out.println(10.1+"->"+round(10.1));
        System.out.println(10.4+"->"+round(10.1));
        System.out.println(10.5+"->"+round(10.1));
        System.out.println(10.9+"->"+round(10.1));
    }

    public static int round(double m) {
        int n = (int) (m + 0.5);
        return n;

    }
}



