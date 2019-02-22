package lianxi6;

public class test {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        Cat cat=(Cat) animal;
        cat.catchMouse();
    }
}
