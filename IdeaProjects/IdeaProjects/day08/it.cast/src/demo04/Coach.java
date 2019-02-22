package demo04;

public abstract class Coach extends Person {
    public Coach(String name) {
        super(name);
    }

    public  abstract void teach();

    @Override
    public void eat(){
        System.out.println(getName()+"吃素食");
    }
    @Override
    public void drink(){
        System.out.println(getName()+"喝白开水");
    }
}
