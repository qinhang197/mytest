package cn.itcast.day05.demo07;

public class max {
    public static void main(String[] args) {
        int[] array= { 5,15,20,30,1000,-20  };
        int min;
        min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];


            }
        } System.out.println("最小值:"+min);
    }
}
