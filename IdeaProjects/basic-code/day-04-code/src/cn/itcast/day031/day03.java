package cn.itcast.day031;

public class day03 {
    public static void main(String[] args) {
        int i = 0, i1 = 10;
        while (i < 5) {
            i++;
            i1++;
            if (i >= 2 & i1 < 15) {
                System.out.println("i:" + i + ",i1:" + i1);


            }

        }System.out.println("-------------------------");
        while (i < 11) {
            i++;
            i1++;
            if (i>=6&&i1<21){
                System.out.println("i:" + i + ",i1:" + i1);
            }
        }
    }
}

