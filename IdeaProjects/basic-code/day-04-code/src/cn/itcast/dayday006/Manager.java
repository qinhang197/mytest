package cn.itcast.dayday006;

public class Manager {
    private String name;
    private String num;
    private int[] salary;

    public Manager(String name, String num, int[] salary) {
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public Manager() {
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

    public int[] getSalary() {
        return salary;
    }

    public void setSalary(int[] salary) {
        this.salary = salary;
    }

    public void intro() {
        System.out.println("经理姓名:" + name);
        System.out.println("工号:" + num);
    }
    public void  showSalary(){
        System.out.println("基本工资为:"+salary[0]+",奖金为:"+salary[1]);


    }
    public void work(){
        System.out.println(" 正在努力的做着管理工作,分配任务,检查员工提交上来的代码......");

    }
}
