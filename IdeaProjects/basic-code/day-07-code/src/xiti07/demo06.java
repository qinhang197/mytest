package xiti07;

public class demo06 {
    public static void main(String[] args) {
        int num=0,count=0;
        for (int i = 1; i < 100; i++) {
            if(i%7==0){
               num+=i;
               count++;
            }
        }System.out.println("被七整除的和:"+num+"计数器:"+count);

    }

}

