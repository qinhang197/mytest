package zuoye;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入最低价格:");
        int num=scanner.nextInt();
        System.out.println("请输入最高价格:");
        int num1=scanner.nextInt();
        Car cars1= new Car("凯迪拉克","银色",600000);
        Car cars2= new Car("劳斯莱斯","白色",700000);
        Car cars3= new Car("奔驰","黑色",320000);
        Car cars4= new Car("物理宏光","银色",40000);
        Car [] cars={cars1,cars2,cars3,cars4};
        filter(cars,num,num1);


    }
    public  static void filter(Car[] cars, int minPrice,int maxPrice){
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice()>minPrice&&cars[i].getPrice()<=maxPrice){
                cars[i].showMsg();
            }
        }
    }
}
