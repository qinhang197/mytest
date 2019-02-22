package cn.itcast.day031;

public class demo09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//2  3 4 5
            for (int j = 4; j > 5 - i; j--) {//5-2=3 4
                System.out.print(" ");
            }
            for (int l = 5; l >= i; l--) {//4 3 2 1

                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
