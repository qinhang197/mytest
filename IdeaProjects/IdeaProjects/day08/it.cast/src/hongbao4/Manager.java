package hongbao4;

import java.util.ArrayList;

public class Manager extends  User {
    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney, int count){
        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney=getMoney();
        if (leftMoney<totalmoney){
            System.out.println("余额不足");
            return  redlist;
        }
        super.setMoney(leftMoney-totalmoney);
        int avg=totalmoney/count;
        int mod=totalmoney%count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        redlist.add(mod + avg) ;
        return redlist;

    }

}
