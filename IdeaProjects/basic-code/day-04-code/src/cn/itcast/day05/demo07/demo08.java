package cn.itcast.day05.demo07;

public class demo08 {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,};
        for (int i = 0; i < array.length; i++) {
           int result=array[i];
            System.out.println("结果是:"+result);
        }
        System.out.println("===========");
        for (int min=0,max=array.length-1;min<max;min++,max--){
              int temp=array[min];
              array[min]=array[max];
              array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            int result = array[i];
            System.out.println("结果是:" + result);
        }
    }
}