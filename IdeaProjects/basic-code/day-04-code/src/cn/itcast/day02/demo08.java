package cn.itcast.day02;

public class demo08 {
    public static void main(String[] args) {
            printNum();
    }
    public static void  printNum(){
        float f1=12345.01F,f2=12345.00F;
        float var1;
        var1=f1>f2?12456:12456.02F;
        float var2=var1+1024;
        System.out.println("var1的值为:"+var1 +" var2的值为:"+var2);


    }
}
