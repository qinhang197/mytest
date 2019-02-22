package cn.itcast.person;

public class demo01stu {
    public static void main(String[] args) {
        stu stu1=new stu("王思聪",20);
        System.out.println("姓名:"+stu1.getName()+",年龄:"+stu1.getAge());
        System.out.println("--------------------------------");
        stu stu2=new stu("王健林",20);
        System.out.println("姓名:"+stu2.getName()+",年龄:"+stu2.getAge());
        stu2.setAge(30);
        System.out.println("姓名:"+stu2.getName()+",年龄:"+stu2.getAge());


    }


}
