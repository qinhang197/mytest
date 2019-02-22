package cn.itcast.ti;

public class E {
    public static void main(String[] args) {
        int a=3,b=4,c=5;
        int getmax=sanjiaoxing(a,b,c);
            boolean b1=zheng(getmax,a,b,c);

        System.out.println(a+":"+b+":"+c+"是否可以组成直角三角形:"+b1);
    }

    public static int sanjiaoxing(int a, int b, int c) {
        int getmax = a > b ? a : b;
        getmax = getmax > c ? getmax : c;
        return getmax;

    }

    public static boolean zheng(int getmax, int a, int b, int c) {
        if (a == getmax) {
            return getmax * getmax == b * b + c * c;
        } else if (b == getmax) {
            return getmax * getmax == a * a + c * c;
        } else if (c == getmax) {
            return getmax * getmax ==a * a + b * b;
        }return  false;
    }

}
