package hongbao;


import java.util.ArrayList;

public class qunzhu extends user{
    public qunzhu() {
    }

    public qunzhu(String name, int money) {
        super(name, money);
    }
    public  ArrayList<Integer> send (int totalmoney,int count){
        ArrayList<Integer> redlist =new ArrayList<>();
        int leftmoney=super.getMoney();
        if (leftmoney>totalmoney){
            System.out.println("余额不足");
            return redlist;
        }
        super.setMoney(leftmoney-totalmoney);
        int avg=leftmoney/count;
        int dom=leftmoney%count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        int lastmoney=avg+dom;
        redlist.add(lastmoney);
        return redlist;
    }


}
