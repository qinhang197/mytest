package zuoye;

public class BascketBallPlayer extends Player {
    public BascketBallPlayer(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(super.getName() + "学扣篮");
    }
}
