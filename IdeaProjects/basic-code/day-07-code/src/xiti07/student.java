package xiti07;

public class student {
    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public student() {

    }

    public student(String name, int age) {

        this.name = name;
        this.age = age;
    }
    public void  show(){
        System.out.println("学生姓名="+name+"学生年龄"+age);
    }
}
