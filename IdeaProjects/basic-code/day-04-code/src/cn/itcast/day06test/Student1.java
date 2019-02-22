package cn.itcast.day06test;
/*
对于基本类型当中的boolean值 ,getter方法一定要写成isxxx型   而setxxx不变
 */
public class Student1 {
    private String name;
    private int age;
    private boolean male;

    public void setMale(boolean b){
        male=b;
    }
    public  boolean isMale(){
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        if (num > 0 && num < 100) {
            age = num;
        } else{

        }
    }

    public int getAge() {
        return age;
    }

}
