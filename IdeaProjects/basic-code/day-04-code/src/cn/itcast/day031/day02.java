package cn.itcast.day031;

public class day02 {
    public static void main(String[] args) {
        double disCount = 1, totalPrice = 550;
        if (totalPrice >= 500) {
            disCount = 0.5;
        } else if (totalPrice >= 400) {
             disCount = 0.6;
        } else if (totalPrice >= 300) {
           disCount = 0.7;
        } else if (totalPrice >= 200) {
             disCount = 0.8;
        }
        System.out.println("totalPrice:" + totalPrice);
        System.out.println("totalPrice的discount:" +( totalPrice*disCount));


    }
}
