package redpackage;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class person extends user{
    public person(String name, int money) {
        super(name, money);
    }

    public person() {

    }
    public  void  receive (ArrayList<Integer> list){
        //从多个红包当中随机抽取一个
        int index=  new  Random().nextInt(list.size()); //  最小是 最高是 size-
        int  delta = list.remove(index);
        //本来有多少钱
        int money=super.getMoney();
        //加法 并且重新设置回去
       super.setMoney ( money+delta);
    }
}
