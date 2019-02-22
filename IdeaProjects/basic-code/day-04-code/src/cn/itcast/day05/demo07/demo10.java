package cn.itcast.day05.demo07;

public class demo10 {

    public static void main(String[] args) {
        int [] array=jisuan(1,6,7);
        System.out.println("总和为:"+array[0]);
        System.out.println("平均值:"+array[1]);

    }
    public static int[] jisuan(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int array[]={sum,avg};
        return array;
    }
}