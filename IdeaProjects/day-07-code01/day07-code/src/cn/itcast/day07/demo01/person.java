package cn.itcast.day07.demo01;

public class person {
    private String name ;

    public person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    double weight;
    double height;
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
    public String getFatLevel(double BMI){
        String str="";
        if (BMI<18.5){
           str= "偏瘦";
           return str;
        }else if (BMI>=18.5&&BMI<24){
            str= "正常";
            return str;
        }else if(BMI<28&&BMI>=24){
            str= "偏胖";
            return str;
        }else if(BMI<40&&BMI>=28){
            str= "肥胖";
            return str;
        }else if (BMI>40){
            str= "严重肥胖";


            return str;
        }else {
            str= "数据错误";
            return str;
        }

    }
}
