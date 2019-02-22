package asda;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
                Student student1=new Student("孙悟空","男",20);
                Student student2=new Student("唐玄奘","男",30);
                Student student3=new Student("铁扇公主","女",40);
        ArrayList<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGender().equals("男")){
                count++;
                System.out.println(list.get(i).getName()+list.get(i).getGender()+list.get(i).getAge());

            }

        }System.out.println("男生一共有:"+count);
    }
}
