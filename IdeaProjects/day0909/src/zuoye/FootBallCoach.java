package zuoye;

public class FootBallCoach extends Coach {

    public FootBallCoach(String name) {
        super(name);

    }
    @Override
    public  void teach(){
        System.out.println(super.getName()+"教射门");
    }
}
