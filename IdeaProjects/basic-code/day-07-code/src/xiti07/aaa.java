package xiti07;

public class aaa {
    public static void main(String[] args) {
        int  bir=1981;
        System.out.println("您的生日为:"+bir);
        int lucky;
        lucky=(bir%10)+(bir/10%10);
        System.out.println("您的幸运数字为:"+lucky);
        int count=0;
        System.out.print("您的会员优惠日为:");
        for (int i = 1; i <= 30; i++) {
            if (i%lucky==0||i%10==lucky){
                count++;
                System.out.print(i+" ");
            };
            }
        System.out.println("共有"+count+"个会员日");

        }



    } //1981/10

//1900%10