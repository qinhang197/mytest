package demo04;

public class test {
    public static void main(String[] args) {
        FootballCoach footballCoach=new FootballCoach("足球教练桑托斯");
        footballCoach.eat();
        footballCoach.drink();
        footballCoach.teach();
        FootballPlayer footballPlayer=new FootballPlayer("足球运动员C罗");
        footballPlayer.eat();
        footballPlayer.drink();
        footballPlayer.study();
        BascketballCoach bascketballCoach=new BascketballCoach("篮球教练安西");
        bascketballCoach.eat();
        bascketballCoach.drink();
        bascketballCoach.teach();
        BascketballPlayer bascketballPlayer=new BascketballPlayer("篮球运动员樱木花道");
        bascketballPlayer.eat();
        bascketballPlayer.drink();
        bascketballPlayer.study();

    }

}
