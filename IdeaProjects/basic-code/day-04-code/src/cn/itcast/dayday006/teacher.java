package cn.itcast.dayday006;

public class teacher {
    private String name ;
    private int  age ;
    private String content ;

    public teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void eat(){
        System.out.println("年龄为"+getAge()+"岁的+"+getName()+"正在吃饭.......");


    }
    public  void content(){
        System.out.println("年龄为"+getAge()+"岁的+"+getName()+"正在亢奋的讲着Java面向对象知识.......");
    }



}
