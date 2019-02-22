package lainxi08;

public class car{
    private  String sp;
    private  String id;
    private  double price;

    public car() {
    }

    public car(String sp, String id, double price) {

        this.sp = sp;
        this.id = id;
        this.price = price;
    }

    public String getSp() {
        return sp;
    }

    public void setSp(String sp) {
        this.sp = sp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
        public  void show(){
            System.out.println("商品名称:"+sp);
            System.out.println("商品编号:"+id);
            System.out.println("商品价格:"+price);
        }
}
