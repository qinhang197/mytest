package practice08;
// 当第一次用到本类 静态代码执行唯一的一次
// 静态内容 总是优先于非静态 所以静态代码块先执行
//静态代码块典型用途 对静态成员变量进行赋值.

public class per {
    public static void main(String[] args) {
         person one =new person();
         person two=new person();
    }
}
