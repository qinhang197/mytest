package lianx;

public class test {
    public static void main(String[] args) {
        Hero hero=new Hero();
        Weapon weapon=new Weapon();
        weapon.setCode("蘑菇炸弹");
        hero.setAge(10);
        hero.setName("提莫");
        hero.setWeapon(weapon);
        hero.attack();

    }

}
