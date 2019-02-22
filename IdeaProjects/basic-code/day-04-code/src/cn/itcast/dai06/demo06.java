package cn.itcast.dai06;


public class demo06 {
    private String brand;
    private double price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }

    public demo06(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public  void message(){

        System.out.println("群发短信");
    }


}
