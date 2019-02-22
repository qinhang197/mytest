package Test.day07;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>();

        Student a1=new Student("赵丽颖",18);
        Student a2=new Student("赵丽颖1",181);
        Student a3=new Student("赵丽颖2",182);
        Student a4=new Student("赵丽颖3",183);

        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("年龄: "+stu.getAge()+"姓名: "+stu.getName());

        }
        Student stu1 = list.get(2);
        System.out.println("年龄: "+stu1.getAge()+"姓名: "+stu1.getName());
        System.out.println("-----------------------------------------");
        int size =list.size();
        System.out.println("集合的长度是:"+size);
        Student stu3 = list.remove(1);
        System.out.println("年龄: "+stu3.getAge()+"姓名: "+stu3.getName());


    }
}
