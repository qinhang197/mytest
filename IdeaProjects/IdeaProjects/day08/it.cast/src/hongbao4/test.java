package hongbao4;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Member member1=new Member("成员1",0);
        Member member2=new Member("成员1",0);
        Member member3=new Member("成员1",0);
        ArrayList<Integer> list = manager.send(20, 3);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        member1.show();
        manager.show();
        member2.show();
        member3.show();
    }
}
