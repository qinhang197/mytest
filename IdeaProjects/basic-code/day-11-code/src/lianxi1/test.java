package lianxi1;

public class test {
    public static void main(String[] args) {
        Body  body=new Body();
        body.methodBody();
        System.out.println("====================");
        Body.Heart method=  new Body().new Heart();
        method.beat();
    }
}
