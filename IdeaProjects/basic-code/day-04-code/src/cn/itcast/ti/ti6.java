package cn.itcast.ti;

public class ti6 {
    public static void main(String[] args){
        printX(10);
    }
    public static void printX(int m){
        for (int i = 0; i<=m; i++) {
            for (int j = 0; j<=m; j++) {
                if(i==j || i+j==m+1){
                    System.out.print("0");
                }else{
                    System.out.print("*");
                }
                System.out.println();

            }

        }
    }
}
