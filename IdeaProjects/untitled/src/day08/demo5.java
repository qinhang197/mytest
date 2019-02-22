package day08;

public class demo5 {
    public static void main(String[] args) {
        double random1=Math.random()*100;
        System.out.println("随机数为:");
        String str=random1+" ";
        System.out.println(random1);
        String str1=str.substring(0,5);
        System.out.println("转换为:");
        System.out.println(str1);

    }
}
