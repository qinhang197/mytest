package practice06;
/*
super关键字的用法大概有三种
 1.在子类的方法中访问父类的成员变量
 2.在子类的成员方法中访问父类的成员方法
 3.在类的构造方法中,访问父类的构造方法
 */

public class zi extends fu{
    int num=    20;
    public  zi(){
        super();
    }
    public void methodzi(){
        System.out.println(super.num);  //父类中的num 访问父类的成员变量

    }
    public  void method(){
        super.method();
        System.out.println("子类方法");  // 父类中的方法  访问父类的成员方法
    }


}
