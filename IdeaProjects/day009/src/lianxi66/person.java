package lianxi66;

import java.util.ArrayList;
import java.util.Random;

public class person extends user {
    public person() {
    }

    public person(String name, int money) {
        super(name, money);
    }
    public void receive(ArrayList<Integer> list){
        Random random=new Random();
        int index=random.nextInt(list.size());

        Integer delta = list.remove(index);
        int  money=super.getMoney();
        super.setMoney(money+delta);
    }
}
