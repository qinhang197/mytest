package hongbao;

import java.util.ArrayList;
import java.util.Random;

public class person extends  user {
    public person() {
    }

    public person(String name, int money) {
        super(name, money);
    }
    public void receive (ArrayList<Integer> list){
        int  index=  new Random().nextInt(list.size());
       int detla= list.remove(index);
        int money=super.getMoney();
        super.setMoney(money+detla);

    }
}