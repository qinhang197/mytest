package practice5;

public class demo02 {
    public static void main(String[] args) {
        phone phone  =new phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("=============================");
        newphone newphone =new newphone();
        newphone.show();
        newphone.call();
        newphone.send();
    }
}
