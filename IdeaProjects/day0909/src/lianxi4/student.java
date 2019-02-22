package lianxi4;

public class student  extends person {
    private  int grade;

    public student(int grade) {
        this.grade = grade;
    }

    public student() {
    }

    public student(int age, String name, int grade) {
        super(age, name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public  void score(){
        System.out.println(getName()+"同学,考试得了:"+grade+"分");
    }
}
