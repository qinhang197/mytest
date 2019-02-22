package practice3;

public class zi extends fu {
    int num =20;
    public  void method(){
        int num =30;
        System.out.println(num);// 局部变量
        System.out.println(this.num);//  20
        System.out.println(super.num);  //父类的成员变量
    }
}
