package cn.itcast.day05.text;

public class c {
    public static void main(String[] args) {

        String[] hs = {"黑桃", "梅花", "红桃", "方片"};
        String[] ds = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        for (int i = 0; i < hs.length; i++) {
            for (int i1 = 0; i1 < ds.length; i1++) {
                System.out.print(hs[i]+ds[i1]);

            }System.out.println();

        }

    }
}
