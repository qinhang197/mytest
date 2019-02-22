package redpackage;

import java.util.ArrayList;

public class redpack {
    public static void main(String[] args) {
        qunzhu qunzhu=new qunzhu("群主",100);
        person person=new person("成员",0);
        person person1=new person("成员1",0);
        person person2=new person("成员2",0);


        qunzhu.show();  //100
        person.show();//0
        person1.show();//0
        person2.show();//0
        System.out.println("=================== ");
        //群主发红包工分成三个红包
        ArrayList<Integer> relist =qunzhu.send(100,3);
       //三个普通成员份红包
        person.receive(relist);
        person1.receive(relist);
        person2.receive(relist);

        qunzhu.show();// 100-80
        person.show();//
        person1.show();
        person2.show();


    }
}
