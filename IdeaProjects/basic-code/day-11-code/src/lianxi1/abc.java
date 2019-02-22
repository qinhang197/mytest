package lianxi1;

import java.util.Scanner;

public class abc {

    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int num = sc.nextInt();//100
        System.out.println("Enter a number (-1 to end):" + num);


        int result = 0;
        while (true) {
            int n = num % 10;//100
            if (n == -1) {
                break;
            }
            System.out.print(n);  //0
            result = result * 10 + n;//  10
            num = num / 10;          //10


            if (num == 0) {
                break;
            }

        }

    }
}

