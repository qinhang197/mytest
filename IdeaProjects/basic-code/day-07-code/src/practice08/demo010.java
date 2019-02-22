package practice08;

import java.util.Arrays;

public class demo010 {
   /* public static void main(String[] args) {
        int []arrays={10,30,20,50,40};
        Arrays.sort(arrays);
            for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+",");
        }
        }*/
   public static void main(String[] args) {
       int [] arrays={1,4,3,9,7,5,6,2,8};

       Arrays.sort(arrays);
       for (int i = arrays.length-1; i >=0; i--) {
           System.out.print(arrays[i]+" ");
       }
   }
    }

