package practice08;

public class demo03 {
    public static void main(String[] args) {
        Student one =new Student("郭靖",19);
        one.room="101教室";
        Student two =new Student("黄蓉",19);
        System.out.println(one.getId()+"姓名:"+one.getName()+",年龄"+one.getAge()+one.room);
        System.out.println(two.getId()+"姓名:"+two.getName()+",年龄"+two.getAge()+one.room);


    }
}
