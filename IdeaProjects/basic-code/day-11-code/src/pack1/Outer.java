package pack1;
  //如果出现的重名现象,呢么格式是:外部类名称.this.外部成员变量
public class Outer {
    int  num=10;
    public  class Inner{
        int num=20;

    public  void methodInner(){
        int num=30;
        System.out.println(num); // 局部变量
        System.out.println(this.num); // 内部类的成员变量
        System.out.println(Outer.this.num); //外部类的成员变量
    }
}  }
