package test1;

public class test2 {
    public static void main(String[] args) {
        int num = 1981;
        System.out.println("您的生日为:" + num);
        int num1 = (num % 10) + (num / 10 % 10);
        System.out.println("您的幸运数字为:" + num1);
        int count = 0;
        System.out.print("本月会员优惠日为:");
        for (int i = 1; i <= 30; i++) {
            if (i % num1 == 0 || i % 10 == num1) { // num1是个位数 i对个位数取余
                //如果等于0  输出 如果 i对10取余等于num1  输出
                count++;
                System.out.print(i + " ");
            }
        }

        System.out.println("共有" + count + "个优惠日");
    }
}
