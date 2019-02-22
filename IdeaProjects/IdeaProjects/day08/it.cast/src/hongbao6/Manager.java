package hongbao6;

import java.util.ArrayList;

public class Manager  extends  User{
    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count){  //定义send方法
        ArrayList<Integer> redlist=new ArrayList<>();  //创建redlist集合
        int leftMoney=getMoney();           //getmoney 获取余额
        super.setMoney(leftMoney+totalMoney);
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
        redlist.add(mod+avg);
        return  redlist;

    }
}
