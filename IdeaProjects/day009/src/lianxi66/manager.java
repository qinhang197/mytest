package lianxi66;

import java.util.ArrayList;

public class manager extends user {
    public manager() {
    }

    public manager(String name, int money) {
        super(name, money);
    }
    public ArrayList<Integer>  send(int totalMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney = super.getMoney();
        if (leftMoney>totalMoney){
            System.out.println("余额不足");
            return  redList;
        }
       super.setMoney(totalMoney-leftMoney);
        int avg=totalMoney/count;
        int mod=totalMoney%count;
        for (int i = 0; i < count - 1; i++) {
            redList.remove(avg);
        }
        redList.remove(avg+mod);
        return redList;
    }
}
