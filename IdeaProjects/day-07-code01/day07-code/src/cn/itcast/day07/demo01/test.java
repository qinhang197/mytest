package cn.itcast.day07.demo01;



public class test {
    public static void main(String[] args) {
        person person=new person("王大锤",70,1.75);
        person person1=new person("孔连顺",99,1.80);

        System.out.println("王大锤BMI为:"+person.getBMI()+",肥胖程度"+person.getFatLevel(person.getBMI()));
        System.out.println("孔连顺BMI为:"+person1.getBMI()+",肥胖程度"+person1.getFatLevel( person1.getBMI()));
    }

}
