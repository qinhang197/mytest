package zuoye;

public class Car {
    private String brand;
    private String color;
    private  int  price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(String brand, String color, int price) {

        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public Car() {
    }

    public  void showMsg(){
        System.out.println("款式为:"+brand+"颜色为:"+color+"价格为:"+price);
    }
}
