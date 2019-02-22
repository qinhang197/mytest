package cn.itcast.day06test;

// 类名称 对象名= new 类名称();
//如果成员变量没有进行赋值,那么将会有一个默认值 规则和数组一样/
//
public class demo02 {
    public static void main(String[] args) {
        student stu=new student();


        System.out.println( stu.name);  //null
        System.out.println(stu.age);   // age
        // 改变对象当中的成员变量当中的内容
        stu.name="qinhang";
        stu.age=20;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("-------------------");
        /*使用对象的成员方法格式 ;
        对象名 成员方法名() */
        stu.eat();
        stu.study();


    }

}
