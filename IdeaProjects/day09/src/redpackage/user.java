package redpackage;

public class user {
    private  String name;                   //用户当父类  无参构造加全餐构造
    private  int money;

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public user(String name, int money) {

        this.name = name;
        this.money = money;
    }
        //展示一下当前用户有多少钱
    public  void show(){
        System.out.println("我叫:"+name+",我有"+money+"元.");
    }
    public user() {

    }
}
