package lianxi2;



public abstract class poultry {  //定义抽象方法
    public poultry() {
    }

    private String name;
    private String symptom;            //定义成员私有变量
    private int age;
    private  String illness;

    public poultry(String name, String symptom, int age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;          //   空参 加全餐
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {            //  定义getset
        this.symptom = symptom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public  abstract void showSymtom();
    public  void showMsg(){                             //提供基本信息 showMsg

        System.out.println("动物种类:"+name+",年龄:"+age+"岁");
        System.out.println("入院原因:"+illness);
        System.out.println("症状为:"+symptom);
    }

}
