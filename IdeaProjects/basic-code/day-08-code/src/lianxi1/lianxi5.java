package lianxi1;

public class lianxi5 {
    public static void main(String[] args) {
        int count = 0;
        double mins = -10.8;
        double maxs = 5.9;
        for (int i = (int) mins; i < maxs; i++) {
            double abs = Math.ceil(i);   //doub le
            if (abs >6 ||abs <2.1) {
                count++;                        //次数自增
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println(count);
    }
}
