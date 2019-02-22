package cn.itcast.dayday006;

public class cat {
    private   int age;
    private   char color;

    public  void showMsg() {
        System.out.println("猫的年龄:"+age+",猫的颜色:"+color);

    }

    public cat() {
    }

    public cat(int age, char color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
