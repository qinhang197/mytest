package demo04;

public  abstract class Player extends Person {
    public Player(String name) {
        super(name);
    }

    public abstract  void study();
    @Override
    public  void eat(){
        System.out.println(getName()+"吃牛肉");
    }
    @Override
    public  void drink(){
        System.out.println(getName()+"喝红牛");
    }
}
