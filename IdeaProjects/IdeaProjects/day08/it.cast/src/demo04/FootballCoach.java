package demo04;

public class FootballCoach extends Coach {

    public FootballCoach(String name) {
        super(name);
    }

    @Override
    public void teach() {
        System.out.println(getName()+"教射门");
    }
}
