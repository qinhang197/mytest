package lainxi5;

public class atuo {
    private String type;
    private double length;
    private double  price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public atuo() {

    }

    public atuo(String type, double length, double price) {
        this.type = type;
        this.length = length;

        this.price = price;
    }

      public void showMsg(){
          System.out.printf("车型:"+type);
          System.out.printf("价格:"+price);
          System.out.printf("车长:"+length);

      }

}
