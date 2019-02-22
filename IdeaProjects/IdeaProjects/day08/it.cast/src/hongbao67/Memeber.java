package hongbao67;

import java.util.ArrayList;
import java.util.Random;

public class Memeber extends User {
    public Memeber(String name, int money) {
        super(name, money);
    }
    public  void receive(ArrayList<Integer> list ){    //创建receive方法 接收空集合
        Random random=new Random();                  //生成随机索引
        int index = random.nextInt(list.size());        //将产生的随机数定义为 集合长度
        int money=list.remove(index);                   //将获取的金额从集合中移除
        super.setMoney(getMoney()+money);           // 重新设置获得的钱

    }
}
