package zuoye;

public class BascketballCoach extends Coach {
    public BascketballCoach(String name) {
        super(name);
    }
    @Override
    public void teach() {
        System.out.println(getName() + "教扣篮");
    }
}
