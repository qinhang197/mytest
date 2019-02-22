package cn.itcast.dayday006;

public class test1 {
    public static void main(String[] args) {
       teacher t1=new teacher("周老师",30,"正在吃饭");
        t1.eat();
        t1.content();
        student s1=new student("韩同学",18,"正在吃饭");
        s1.eat();
        s1.study();

    }


}
