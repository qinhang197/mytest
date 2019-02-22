package hongbao;

import java.util.ArrayList;

public class Manager  extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){   //
        ArrayList<Integer> redlist=new ArrayList<>();
        int leftMoney=getMoney();
        if (leftMoney<totalMoney){
            System.out.println("余额不足");
            return  redlist;

        }
        super.setMoney(leftMoney-totalMoney);
        int avg=totalMoney/count;
        int mod=totalMoney%count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        int delta=(avg+mod);
        redlist.add(delta);
        return  redlist;
    }
}
