package practice08;

import java.util.Arrays;

public class lianxi2 {
 /*public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");

        }System.out.println();

        for (int max = arrays.length - 1, min = 0; min < max; max--, min++) {
            int temp = arrays[min];
            arrays[min] = arrays[max];
            arrays[max] = temp;

        }
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");


        }
    }*/


    public static void main(String[] args) {
        int []arr ={2,1,3,4,7,6,5,8,9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int num = arr.length; num>0; num--) {
            System.out.print(num+" ");

        }
    }
}