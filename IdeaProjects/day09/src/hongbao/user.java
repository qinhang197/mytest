package hongbao;

public class user {
    private String name;
    private int money;

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
}
