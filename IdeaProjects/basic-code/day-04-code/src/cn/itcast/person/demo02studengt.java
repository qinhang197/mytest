package cn.itcast.person;

public class demo02studengt {
    public static void main(String[] args) {
        student stu=new student();
        student stu2=new student("赵丽颖",20);
        System.out.println("我的名字是:"+stu2.getName()+",年龄是:"+stu2.getAge() );

        stu2.setAge(21);
        System.out.println("我的名字是:"+stu2.getName()+",年龄是:"+stu2.getAge())
        ;


    }


}
