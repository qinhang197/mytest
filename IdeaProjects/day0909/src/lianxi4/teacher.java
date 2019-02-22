package lianxi4;

public class teacher extends  person {
     private String  xueke;

    public teacher() {
    }

    public String getXueke() {
        return xueke;
    }

    public teacher(String xueke) {
        this.xueke = xueke;
    }

    public teacher(int age, String name, String xueke) {
        super(age, name);
        this.xueke = xueke;
    }

    public void setXueke(String xueke) {
        this.xueke = xueke;

    }
    public void teach(){
        System.out.printf(getName()+"老师,讲授"+xueke+"课");
    }
}
