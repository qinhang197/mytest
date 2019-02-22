package zuoye;

public abstract class Person {
    private  String name;

    public String getName() {
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public abstract void eat();
    public  abstract void drink();
}
