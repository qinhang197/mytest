package cn.itcast.ti;

public class ti2 {
    public static void main(String[] args) {
        boolean b = doCheck(2);
        System.out.println(b);
        boolean b1 = doCheck(3);
        System.out.println(b1);
    }

    public static boolean doCheck(int num) {
        boolean flag;
        if (num % 2 == 0) {
            for (int i = 0; i <= 20; i++) {
                num -= i;

            }flag = true;


        } else {
            for (int i = 0; i <= 20; i++) {
                num += i;

            }flag = false;


        }
        System.out.println("num:" + num);
        return flag;
    }
}
