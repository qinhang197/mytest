package day08;

import java.util.Scanner;

public class  demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String next = scanner.next();
        int b = scanner.nextInt();
        String count = count(a, next, b);
        System.out.println(a + next + b + "=" + count);
    }

    private static String count(int a, String next, int b) {
        int r = 0;
        ;
        if ("+".equals(next)) {
            r = a + b;
        } else if ("-".equals(next)) {
            r = a - b;
        } else if ("*".equals(next)) {
            r = a * b;
        } else if ("/".equals(next)) {
            r = a / b;
        } else {
            return null;
        }

        return r+"";

    }
}
