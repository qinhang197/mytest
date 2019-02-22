package lianxi1;

public class lianxi1 {
    public static void main(String[] args) {
        String []  array={"1","2","3"};
        String s="[";
        System.out.print(s);

        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                System.out.print("word".concat(array[i])+"]");

            }else {
                System.out.print("word".concat(array[i])+"#");
            }

        }
    }


}

