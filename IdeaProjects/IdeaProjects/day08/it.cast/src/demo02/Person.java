package demo02;

public class Person {
    private String  name;
    private  double weight;
    private  double height;


    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getBMI(){
        double BMI=weight/(height*height);
        return BMI;
    }
    public  String getFatLevel(double bmi){
        if (bmi<18.5){
            return "偏瘦";
        }else if(bmi>=18.5&&bmi<24){
            return "正常";
        }else if (bmi>=24&&bmi<28){
            return "偏胖";
        }else if(bmi>=28&&bmi<40){
            return "肥胖";
        }else {
            return  "严重肥胖";
        }
    }
}
