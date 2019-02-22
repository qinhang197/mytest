package zuoye;

public abstract class Player extends Person {
    public Player(String name) {
        super(name);
    }

    public void study() {

    }
        @Override
    public void eat() {
        System.out.println(super.getName()+"吃牛肉");

    }
    @Override
    public void drink(){
        System.out.println(super.getName()+"喝红牛");
    }
}
