package demo03;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入最高价格:");
        int maxPrice= scanner.nextInt();
        System.out.println("请输入最低价格:");
        int minPrice=scanner.nextInt();
        Car car1=new Car("凯迪拉克","银色",600000);
        Car car2=new Car("奔驰","黑色",320000);
        Car car3=new Car("劳斯莱斯","白色",700000);
        Car car4=new Car("五菱宏光","银色",40000);
        Car[] car={car1,car2,car3,car4};
        filter(car,minPrice,maxPrice);
    }
    public static void filter(Car[]cars,int minPrice,int maxPrice){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice()>=minPrice&&cars[i].getPrice()<maxPrice){
                cars[i].showMsg();
            }
        }
    }
}
