package cn.itcast.day06test;

public class t1 {
    public static void main(String[] args) {
        int[] array={10,20,30,40,50};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.print(array[i]+"]");

            }else {
                System.out.print(array[i]+",");
            }

        }
    }
}
