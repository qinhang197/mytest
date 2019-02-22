package zuoye;

public class FootballPlayer  extends  Player{
    public FootballPlayer(String name) {
        super(name);
    }

    @Override
    public  void  study(){
        System.out.println(super.getName()+"学射门");
    }
}
