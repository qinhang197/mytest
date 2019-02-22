package cn.itcast.dayday006;

public class coder {
    private String name;
    private String num;
    private int salary;

    public coder(String name, String num, int salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public coder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void intro(){
        System.out.println("程序员姓名:"+name);
        System.out.println("工号:"+num);
    }
    public  void showSalary(){
        System.out.println("基本工资为:"+salary+",奖金无");
    }
    public  void work(){
        System.out.println("正在努力写代码........");
    }
}
