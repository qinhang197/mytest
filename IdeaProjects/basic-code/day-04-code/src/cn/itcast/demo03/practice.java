package cn.itcast.demo03;

import java.util.Scanner;

/*
需求: 定义变量int作为考试成绩，使用if语句判断成绩, 输出学生等级
	90-100 优秀
	80-89 好
	70-79 良
	60-69 及格
	60 以下 不及格
	对于不正常分数的处理(其他分数)

 */
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("请输入学生成绩:");
            int num=sc.nextInt();
            if (num>=90&&num<=100){
                System.out.println("优秀");
            }else if(num>=80&&num<90){
                System.out.println("好");
            }else  if(num>=70&&num<80){
                System.out.println("良好");
            }else if (num>=60&&num<70){
                System.out.println("及格");
            }else   if (num<60){
                System.out.println("不及格");
            }else{
                System.out.println("数据错误");
            }
        }

    }
}
