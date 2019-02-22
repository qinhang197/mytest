package cn.itcast.day06test;

public class Demo04Student {
    public static void main(String[] args) {
        Student1 stu=new Student1();
        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);
        System.out.println("姓名:"+stu.getName());
        System.out.println("年龄:"+stu.getAge());
        System.out.println("性别:"+stu.isMale());

    }
}
