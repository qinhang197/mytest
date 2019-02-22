package hongbao6;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {


    Manager managers =new Manager("群主",100);
    Member member1=new Member("成员1",0);
    Member member2=new Member("成员1",0);
    Member member3=new Member("成员1",0);
    ArrayList<Integer> list=   managers.send(100,3);
         member1.receive(list);
         member2.receive(list);
         member3.receive(list);
         managers.show();
         member1.show();
         member2.show();
         member3.show();
}
}
