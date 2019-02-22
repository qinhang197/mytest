package nnn;

import zuoye.Car;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入最低价");
         int num=scanner.nextInt();
        System.out.println("请输入最高价");
         int num1=scanner.nextInt();

        Car car1 = new Car("凯迪拉克", "银色", 600000);
        Car car2 = new Car("奔驰", "黑色", 320000);
        Car car3 = new Car("劳斯莱斯", "白色", 700000);
        Car car4 = new Car("五菱宏光", "银色", 40000);
        Car [] cars={car1,car2,car3,car4};
        filter(cars,num,num1);
    }
    public  static void filter(Car[]cars,int minPrice,int maxPrice){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getPrice()>minPrice && cars[i].getPrice()<=maxPrice){
               cars[i].showMsg();
            }
        }
    }
}
