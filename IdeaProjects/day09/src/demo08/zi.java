package demo08;
/*
super 关键字访问父类内容   this关键字访问本类内容   用法有三种
1.在本类的成员方法中  访问本类的成员变量
2.在本类的成员方法中 还能访问另一个成员方法
3.在本类的构造方法中  访问另个构造方法
第三用法注意
this (...)调用也必须是构造方法的第一个语句 唯一一个
super和This 两种调用格式不能同时使用.

 */
public class zi extends  fu {
    int num=20;
    public  zi(){
        this(10);  //本类的无参构造 调用了本类的有参构造
    }
    public zi(int n){
        this(1,2);
    }
    public zi(int n,int b){

    }
    public void shownum(){
      int  num=10;
        System.out.println(this.num); // 本类的成员变量
        System.out.println(num);        // 局部变量
        System.out.println(super.num);  //父类中的成员变量
    }
    public  void methodA(){
        System.out.println("AAA");
    }
    public  void methodB(){
       this.methodA();  //来源于本类当中的
        System.out.println("BBB");
    }
}
