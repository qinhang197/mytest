package lianxi2;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        student stu1=new student("王思聪",30);
        student stu2=new student("王健林",60);   // 创建对象调用全参
        student stu3=new student("王小二",18);
        student stu4=new student("王大拿",50);
        ArrayList<student> list=new ArrayList<>();          //
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名:"+list.get(i).getName()+",年龄:"+list.get(i).getAge()+"岁");
        }
    }

}
