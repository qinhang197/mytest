package cn.itcast.ti;

public class ti5 {
    public static void main(String[] args) {
        getmaxvalue("最大值", 5, 6, 7);
        getmaxvalue("最小值", 5, 6, 7);
    }

    public static void getmaxvalue(String get, int a, int b, int c) {
        switch (get) {
            case "最大值":
                int max1 = getMax(a, b, c);
                System.out.println("最大值为:" + max1);
                break;
            case "最小值":
                int min1 = getMin(a, b, c);
                System.out.println("最小值为:" + min1);
                break;

        }

    }

    private static int getMin(int i, int j, int k) {
        int min1 = i < j ? (i < k ? i : k) : (j < k ? j : k);
        return min1;
    }


    private static int getMax(int i, int j, int k) {
        int max1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
        return max1;
    }
}


