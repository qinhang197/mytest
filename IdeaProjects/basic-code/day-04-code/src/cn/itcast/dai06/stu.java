package cn.itcast.dai06;

public class stu {
    public static void main(String[] args) {
    Student stu1=new Student("王老师",20);
        System.out.println("姓名:"+stu1.getName()+"  年龄:"+stu1.getAge());
        Student stu2=new Student();
        stu2.setName("赵丽颖");
        stu2.setAge(20);
        System.out.println("姓名:"+stu2.getName()+"  年龄:"+stu2.getAge());
    }
}