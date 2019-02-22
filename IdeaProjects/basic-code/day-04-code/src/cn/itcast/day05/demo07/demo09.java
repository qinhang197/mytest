package cn.itcast.day05.demo07;

public class demo09  {
    public static void main(String[] args) {
         int array[]={1,2,3,4,5,6,7};
        System.out.println(array);
         getarray(array);
        System.out.println("========");
         getarray(array);
        System.out.println("===========");


    }
    public static void getarray(int [] tima){
        System.out.println(tima);
        for (int i = 0; i <tima.length; i++) {

            System.out.println(tima[i]);
        }
    }
}