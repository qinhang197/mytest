package lianxi66;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        manager Manager=new manager("群猪",100);
        person Person1= new person("成员1",0);
        person Person2= new person("成员2",0);
        person Person3= new person("成员3",0);

        Manager.show();
        Person1.show();
        Person2.show();
        Person3.show();
        System.out.println("======================");
        ArrayList<Integer> redlist = Manager.send(20, 3);
        Person1.receive(redlist);
        Person2.receive(redlist);
        Person3.receive(redlist);
        Manager.show();
        Person1.show();
        Person2.show();
        Person3.show();



    }
}
