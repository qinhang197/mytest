package cn.itcast.dayday006;

public class circle01 {
    public static void main(String[] args) {
        circle c1=new circle(8);


        System.out.println("半径为:"+c1.getR()+"面积为:"+(3.14*c1.getR()*c1.getR()));
        System.out.println("半径为:"+c1.getR()+"周长为:"+(3.14*2*c1.getR()));
    }


}
// 标准构造  set+全参+无参 + +get