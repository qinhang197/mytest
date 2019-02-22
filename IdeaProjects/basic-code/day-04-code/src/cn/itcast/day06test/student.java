package cn.itcast.day06test;

/* 属性  体重 学号 所在班级 姓名   年龄 身高
行为  学习 吃饭 睡觉
对应到java的类当中
成员变量的 属性 :数据类型 变量名称   string name ;
int age

成员方法的行为    public   void eat() {}
                public void learn){}
                public  void study(){}

*/
//注意事项
// 成员变量 是直接定义在类当中的 是在方法外
// 成员方法 不写 static 关键字.
public class student {

    String name; //姓名
    int age;

    public void eat() {
        System.out.println("吃饭!");
    }

    public void sleep() {
        System.out.println("睡觉!");
    }

    public void study() {
        System.out.println("学习");
    }

}
