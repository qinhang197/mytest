package cn.itcast.ti;

public class D {
    public static void main(String[] args) {
        printX(10);

    }
    public static int  printX(int m){
        for (int i = 1; i <=m; i++) {
            for(int j=1;j<=m;j++){
                if(i==j||j+i==m+1){
                    System.out.print("0");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();


        }return m;
    }
}
