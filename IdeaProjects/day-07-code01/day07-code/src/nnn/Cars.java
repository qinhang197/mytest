package nnn;

public class Cars {
    private  String brand;
    private  String color;
    private  int price;

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

    public Cars(String brand, String color, int price) {

        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public  void showMsg(){
        System.out.println("车型:"+brand+"颜色"+color+"价格"+price);
    }
}
