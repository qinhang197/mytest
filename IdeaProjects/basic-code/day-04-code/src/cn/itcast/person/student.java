package cn.itcast.person;

//构造方法不能return .
// 如果没有编写构造方法  编译器默认赠送 没有参数 方法体什么都不做
//自带构造方法
public class student {
    private String name;
    private int age;

    public student() {
        System.out.println("wucan.");
    }

    public student(String name, int age) {
        System.out.println("youcan");

        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name=name;
    }
    public  String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public  int getAge(){
        return age;
    }

}
