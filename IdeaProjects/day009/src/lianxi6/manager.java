package lianxi6;

import java.util.ArrayList;

public class manager extends user{
    public manager(){
        //super();
    }

    public manager(String name, int money) {   //调用父类的构造方法
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney=super.getMoney(); //群主当前余额
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
            return  redList;//返回空集合
        }
        super.setMoney(leftMoney-totalMoney);
        int avg=totalMoney/count;
        int mod=totalMoney%count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
            redList.add(mod+avg);  //最后一个红包
         return   redList;
    }


}

