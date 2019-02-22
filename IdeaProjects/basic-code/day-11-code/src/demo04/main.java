package demo04;

public class main {
    public static void main(String[] args) {
  hero Hero=new hero();
    Hero.setName("英雄");  //设置名称
//        Skill skill=new Skill() {
//            @Override
//            public void use() {
//                System.out.println("大招");
//            }
//        };
            Hero.setSkill(new Skill() {
                @Override
                public void use() {
                    System.out.println("biubiuibuibiu");
                }
            });
        Hero.attack();
    }
}
