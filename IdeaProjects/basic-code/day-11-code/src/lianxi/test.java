package lianxi;

public class test {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setName("盖伦");
        TuitaSkill tuitaSkill=new TuitaSkill();
      hero.setSkill(tuitaSkill);
        hero.attack();

    }
}
