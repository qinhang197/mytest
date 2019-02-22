package cn.itcast.day031;

public class demo05 {
    public static void main(String[] args) {
        // 定义变量  a,b
        int a = 0,b=0;
        //for 循环 初始化 ii=0 ;jj=20 ii=ii+2
        for (int ii = 0,jj=20; ii < jj; ii+=2,jj--) {
            //
            if (ii%3==0){
                a=ii;
                System.out.println(a+" Hello");
            }else {
                b=ii;
                System.out.println(b+"  World");
            }

        }
        System.out.println();
        System.out.println("a*b的值为:"+a+"*"+b+"="+(a*b));
    }



}
