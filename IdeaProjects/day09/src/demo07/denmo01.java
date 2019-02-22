package demo07;
/*
继承关系中  父子类构造方法的访问特点
 子类构造方法中有一个默认隐含的 super 调用 子类必须调用父类的方法
 2.  子类构造可以通过super关键字来子类构造调用父类重载构造.
 3.super 的父类构造调用    必须是子类构造的第一个语句
 不能一个子类构造调用多个super构造
 4.子类必须调用父类的构造方法   不写赠送super(); 只有子类的   构造的方法  才能调用父类构造方法
 */
public class denmo01 {
    public static void main(String[] args) {

         zi zi =new zi();

    }
}
