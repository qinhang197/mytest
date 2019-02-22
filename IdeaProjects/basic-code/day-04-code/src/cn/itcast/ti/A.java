package cn.itcast.ti;

public class A {
    public static void main(String[] args) {
        int sum=getsum();
        System.out.println("偶数和为:"+sum);
    }
    public static int getsum(){
        int sum=0;
     for (int i = 1; i <=100; i++) {
            if(i%2==0){
                sum+=i;
            }

        }return sum;
    }

}

