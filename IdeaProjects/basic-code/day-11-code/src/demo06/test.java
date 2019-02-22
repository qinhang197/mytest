package demo06;

public class test {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setName("盖伦");




       hero.setSkill(new Skill() {
           @Override
           public void use() {
               System.out.println("biubiubiubiu");
           }
       });
         hero.attack();
    }
}
