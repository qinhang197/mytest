package cn.itcast.day031;

public class demo10 {
    public static void main(String[] args) {
        for (int i = 1; i <=7; i++) {
             for(int j=1;j<=7;j++){
                 if(j==i||j+i==8){
                     System.out.print("0");

                 }else {
                     System.out.print("*");
                 }

             }System.out.println();



        }
    }
}
