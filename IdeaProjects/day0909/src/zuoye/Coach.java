package zuoye;

public abstract class Coach extends Person  {
    public Coach(String name) {
        super(name);
    }

    public abstract void teach();
    @Override
    public  void eat(){
        System.out.println(super.getName()+"吃素食");
    }
    @Override
    public  void drink(){
        System.out.println(super.getName()+"喝白开水");
    }
}
