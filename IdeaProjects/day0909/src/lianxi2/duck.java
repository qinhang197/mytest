package lianxi2;

class  duck extends poultry {    //定义普通鸭子类 继承poultrry
    public duck(){

    }

    public duck(String name, String symptom, int age, String illness) {   //全参构造
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymtom() {                      // 重写 方法    打印症状信息
        System.out.println("症状为:"+getSymptom());
    }

}
