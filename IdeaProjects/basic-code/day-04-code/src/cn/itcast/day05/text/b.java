package cn.itcast.day05.text;

public class b {
    public static void main(String[] args) {
            getpuke(1,5,50);
    }

    public static String[] puke() {
        String[] color = {"黑色", "红色", "梅花", "方块"};
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
        String[] puke = new String[54];
        int sum = 0;
        for (int i = 0; i < color.length; i++) {
            for (int i1 = 0; i1 < num.length; i1++) {
                puke[sum] = color[i] + num[i1];
                sum++;

            }
            puke[52] = "大王";
            puke[53] = "小王";


        }
        return puke;


    }

    public static void getpuke(int a, int b, int c) {
        if (a >= 1 && a <= 54 && b >= 1 && b <= 54 && c >= 1 && c <= 54) {
            System.out.print(puke()[a - 1] );
            System.out.print(puke()[b - 1] );
            System.out.print(puke()[c - 1] );

        } else {
            System.out.println("数据输出错误");
        }
    }


}
