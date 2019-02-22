package cn.itcast.ti;

public class C {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        num(a, b);
        doubling(a, b);
        num(a, b);
        System.out.println("******");
        a=doubling(a);
        b=doubling(b);
        num(a,b);

    }

    public static void num(int iVar, int iVar2) {

        System.out.println("iVar:" + iVar + ",iVar2:" + iVar2);

    }

    public static void doubling(int r, int p) {
        r *= 2;
        p *= 2;
        System.out.println("翻倍r=" + r + ",p=" + p);

    }

    public static int doubling(int r) {
        r *= 2;
        return r;

    }

}
