package animal;

public class test {
    public static void main(String[] args) {
         Animal animal= new Cat();
         animal.eat();

        System.out.println("================");
         Animal animal1=new Animal() {
             @Override
             public void eat() {
                 System.out.println("狗吃肉");
             }
         };
         animal1.eat();
         Animal animal2=new Animal() {
             @Override
             public void eat() {
                 System.out.println("奥特曼打小怪兽");
             }
         };
         animal2.eat();
        new Animal() {
            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        }.eat();
    }
}
