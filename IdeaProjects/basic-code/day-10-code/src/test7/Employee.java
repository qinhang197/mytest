package test7;

public class Employee {
    String name;
    double money;
    double  card;
    String id;
    public Employee() {
    }

    public Employee(String name, double money, double card, String id) {

        this.name = name;
        this.money = money;
        this.card = card;
        this.id = id;
    }

    public Employee(String name, double money, String id) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getCard() {
        return card;
    }

    public void setCard(double card) {
        this.card = card;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public  void show(){
        System.out.print(name+"的薪资为:"+money+"\n\n");
        System.out.println("卡余额是:"+card);
    }
}
