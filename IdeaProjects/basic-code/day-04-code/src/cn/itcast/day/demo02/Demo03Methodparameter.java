package cn.itcast.day.demo02;

public class Demo03Methodparameter {
    public static void main(String[] args) {
        method1(10,20);
        System.out.println("=======");
        method2();
    }
    public static void method1(int a,int b){
            int result=a*b;
            System.out.println("结果是:" +result);

        }
    public static void  method2(){
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello,World!"+i);

            }
        }




}

