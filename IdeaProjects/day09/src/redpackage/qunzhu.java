package redpackage;

import java.util.ArrayList;
//群主的类
public class qunzhu extends user {
    public  qunzhu(){

    }

    public qunzhu(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalmoney,int count ){
        //需要一个集合 用来存储若干红包集合
        ArrayList<Integer> redlist =new ArrayList<>();
         // 看群主有多少钱
        int leftmoney=super.getMoney();
        if (totalmoney>leftmoney){
            System.out.println("余额不足");
            return  redlist;
        }
        //扣钱
        super.setMoney(leftmoney-totalmoney);

        //发红包需要拆分 需要平均拆分为count份
        int avg =totalmoney/count;
        int mod =totalmoney%count;  //余数 零头
        //剩下的零头包在最后一个红包当中
        //把红包一个一个放入集合当中
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);

        }//最后一个红包
        int last=avg+mod;
        redlist.add(last);
        return redlist;
    }
}
