package test1;

public class test4 {
    public static void main(String[] args) {

        int[] array = {355, 345, 345, 330, 360, 400, 450};

      int max=  getMaxPrice(array);
       int min= getMinPrice(array);
        System.out.println(max);
        System.out.println(min);
    }

    public static int getMaxPrice(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length ; i++) {

            if (array[i] > array[0]) {
                max = array[i];

            }
        }
        return max;
    }
    public static int getMinPrice(int[] array) {
        int min= array[0];
        for (int i = 0; i < array.length ; i++) {

            if (array[i]< array[0]) {
                min = array[i];

            }
        }
        return min;
    }
}

