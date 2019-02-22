package Student;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Student stu1= new Student("孙悟空","男",20);
        Student stu2= new Student("唐玄奘","男",30);
        Student stu3= new Student("铁扇公主","女",40);
        ArrayList<Student> list=new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if ("男".equals(list.get(i).getGender())){
              list.get(i).showMsg();
                count++;
            }
        }
        System.out.println("一共有几个人:"+count);
    }


}
