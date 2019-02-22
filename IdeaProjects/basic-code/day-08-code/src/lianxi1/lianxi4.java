package lianxi1;

public class lianxi4 {
    public static void main(String[] args) {
        int count = 0;
        double mins = Math.ceil(-10.8);  ///-10
        double maxs = Math.ceil(5.9);     //6
        for (double i = mins; i < maxs; i++) {
           double abs = Math.abs(i);   //绝对值
            if (abs > 6 || abs < 2.1) {
                count++;                        //次数自增
                System.out.print(i + " ");
            }

        }
        System.out.println();
        System.out.println(count);
    }
}




