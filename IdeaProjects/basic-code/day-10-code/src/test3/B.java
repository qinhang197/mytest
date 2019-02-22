package test3;

public class B  implements A {


    public static  void showD(){
        System.out.print("DDDD");

    }

    @Override
    public void showA() {
        System.out.print("AAA");
        System.out.println();
    }
}
