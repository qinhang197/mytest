package test1;

public class test3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i%10;
            int b = i/10%10;
            int c = i/100%10;
            if (a*a*a+b*b*b+c*c*c == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("水仙花个数" + count);

    }

}
