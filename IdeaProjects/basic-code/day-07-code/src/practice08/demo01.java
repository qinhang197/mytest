package practice08;

public class demo01 {
    public static void main(String[] args) {
        int count=num();
        System.out.println(count);
    }

    public static int num(){
        int count=0;
        for (int i =100; i <=999; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                count++;
            }

        }
        return count;


    }
}
