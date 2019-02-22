package cn.itcast.person;
/*关键词修饰
所有成员变量都要用private
为每个成员变量添加 getter setter
编写一个无参数的构造方法
编写一个全参数的构造方法
 */

public class stu {

    private String name;
    private  int age;       //成员变量

    public stu() {          //无参构造
    }

    public stu(String name, int age) {   //全参构造
        this.name = name;
        this.age = age;
    }

    public String getName() {               //getter  setter
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
}
