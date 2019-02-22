package day08;

public class class3 {
    public static void main(String[] args) {
        int count=0;    //  定义 count次数
        double min=-10.8;      // 定义最小值
        double max=5.9;             //定义最大值
        for (int i=(int)min;i<max;i++){

            // for循环 min转换int
            int abs=Math.abs(i);               // abs 向上取整
            if (abs>6||abs<2.1){
                System.out.print(i+" ");
                count++;
            }


        }
        System.out.println();
        System.out.print(count);

    }
}
