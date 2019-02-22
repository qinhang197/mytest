package lianxi66;

public class user {
        private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public user() {

    }

    public user(String name, int money) {

        this.name = name;
        this.money = money;
    }

    private  int money;

    public  void show(){
        System.out.println("我叫"+name+",我有多少钱"+money);
    }
}
