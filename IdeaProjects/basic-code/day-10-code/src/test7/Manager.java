package test7;

public class Manager extends Employee {
   private  double bounds;


    public Manager(double bounds) {
        this.bounds = bounds;
    }

    public double getBounds() {
        return bounds;
    }

    public void setBounds(double bounds) {
        this.bounds = bounds;
    }

    public Manager(String name, double money,  String id, double bounds) {

        super(name, money,  id);
        this.bounds = bounds;
    }
}
