package cn.itcast.dayday006;

public class test {
    public static void main(String[] args) {
        int[] sarlary = {15000, 3000};
        Manager m1 = new Manager("James", "9527", sarlary);
        m1.intro();
        m1.showSalary();
        m1.work();
        System.out.println("------------------------");
        coder c1=new coder("Kobe","0025",10000);
        c1.intro();
        c1.showSalary();
        c1.work();

    }



    }



