package demo04;

public class FootballPlayer extends Player {

    public FootballPlayer(String name) {
        super(name);
    }

    @Override
    public void study() {
        System.out.println(getName()+"学射门");
    }
}
