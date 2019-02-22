package hongbao67;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Manager manager=new Manager("群主",100);
        Memeber memeber1=new Memeber("成员1",0);
        Memeber memeber2=new Memeber("成员2",0);
        Memeber memeber3=new Memeber("成员3",0);
        ArrayList<Integer> redlist = manager.send(20, 3);
        memeber1.receive(redlist);
        memeber2.receive(redlist);
        memeber3.receive(redlist);
        manager.show();
        memeber1.show();
        memeber2.show();
        memeber3.show();
    }
}
