package cn.itcast.day031;

public class demo04 {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        method1();
        method2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
    public static void method1(){
        int a=-5,b=--a;
        if(a%2==0){
            a=++b;
        }else {
            b=--a;
        }

        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------");
    }
    public  static void method2() {
        int a = 0;
        for (int i = 1; i < 7; i++) {
            for (int i1 = 1; i1 < 6; i1++) {
                System.out.print(i1 + " ");

            }
            System.out.println();
        }System.out.println("----------");

    }


}
