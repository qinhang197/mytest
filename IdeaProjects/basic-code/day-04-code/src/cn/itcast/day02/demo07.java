package cn.itcast.day02;

public class demo07 {
    public static void main(String[] args) {
            printNum();
    }
    public static void  printNum(){
        int a=9,b=9;
        int num=++a;
        boolean bo=num>=10?true:false;
        System.out.println("bo的值"+bo);
        int num2=b++;
        boolean bo2=num2>=10?true:false;
        System.out.println("bo2的值"+bo2);

    }
}
