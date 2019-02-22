package lianxi4;

public class test {
    public static void main(String[] args) {
        phone   Phone=new phone();
        Phone.call();
        Phone.sendMessage();
        Phone.show();
        System.out.println("=============");
        NewPhone newPhone= new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.show();
    }
}
