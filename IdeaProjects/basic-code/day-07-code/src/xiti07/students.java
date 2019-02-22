package xiti07;



import java.util.ArrayList;
import java.util.Scanner;

public class students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<student> list=new ArrayList<>();
        while (true){
            System.out.println("1.录入信息 0.退出");
            int i=sc.nextInt();
            switch (i){
                case 1:
                    input(list,sc);
                    break;
                case 0:
                    System.out.println("录入完毕");
                }
                if(i==0){
                break;
                }


            }
            for (int i = 0; i < list.size(); i++) {
                student stu=list.get(i);
                stu.show();

        }



    } private static void input(ArrayList<student> list, Scanner sc) {
        System.out.println("请输入姓名:");
        String name=sc.next();
        System.out.println("请输入年龄:");
        int age=sc.nextInt();
        student stu=new student(name,age);
        list.add(stu);  }
    }



