package hongbao;

import java.util.ArrayList;
import java.util.Random;

public class Member   extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public  void receive(ArrayList<Integer> list){
        Random random=new Random();
        int index=random.nextInt(list.size());
        int money=list.remove(index);
        super.setMoney(super.getMoney()+money);

    }
}
