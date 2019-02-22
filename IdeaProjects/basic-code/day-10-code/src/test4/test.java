package test4;

public class test {
    public static void main(String[] args) {
         Star star= new Star();
         star.shine();
        System.out.println("=================");
        Universe universe=new Sun();
        universe.doAnything();
        Sun sun=(Sun)universe;  //向下转型
        sun.shine();
    }
}
