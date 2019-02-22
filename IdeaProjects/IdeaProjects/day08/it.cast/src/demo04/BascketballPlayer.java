package demo04;

public class BascketballPlayer  extends Player{
    public BascketballPlayer(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName()+"学扣篮");
    }
}
