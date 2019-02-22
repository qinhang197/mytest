package zuoye;

public class test {
    public static void main(String[] args) {
        FootBallCoach footBallCoach=new FootBallCoach("足球教练桑托斯");
        footBallCoach.eat();
        footBallCoach.drink();
        footBallCoach.teach();
        System.out.println("==============================");
        FootballPlayer footballPlayer=new FootballPlayer("足球运动员C罗");
        footballPlayer.eat();
        footballPlayer.drink();
        footballPlayer.study();
        System.out.println("==============================");
        BascketballCoach bascketballCoach=new BascketballCoach("篮球教练安西");
        bascketballCoach.eat();
        bascketballCoach.drink();
        bascketballCoach.teach();
        System.out.println("==============================");
        BascketBallPlayer bascketBallPlayer=new BascketBallPlayer("篮球运动员樱木花道");
        bascketBallPlayer.eat();
        bascketBallPlayer.drink();
        bascketBallPlayer.study();
    }
}
