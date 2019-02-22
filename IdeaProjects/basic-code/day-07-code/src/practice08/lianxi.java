package practice08;

public class lianxi {
   /* public static void main(String[] args) {
        int[]array={10,20,30,15,10000};
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("最大值:"+min);
    }*/
   public static void main(String[] args) {
       int[]array={10,20,30,15,10000};
       int max=array[0];
       for (int i = 1; i <array.length; i++) {
           if(array[i]>max){
               max=array[i];
           }
       }
       System.out.println("最大值:"+max);
   }


}
