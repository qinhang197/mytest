package demo02;

public class test {
    public static void main(String[] args) {
        Person one =new Person("王大锤",70,1.75);
        Person two =new Person("孔连顺",99,1.80);
        System.out.println(one.getName()+"的BMI为:"+one.getBMI()+"肥胖程度"+one.getFatLevel(one.getBMI()));
        System.out.println(two.getName()+"的BMI为:"+two.getBMI()+"肥胖程度"+two.getFatLevel(two.getBMI()));
    }
}
