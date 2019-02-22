package cn.itcast.dayday006;

public class book1 {

    public static void main(String[] args) {
        Book b1 = new Book("No001", "Java", "isbn1263", 50.0,"2017-0101");
        Book b2 = new Book("No002", "web", "isbn12634", 51, "2017-01-01");
        Book b3 = new Book("No003", "JavaWeb实战", "isbn387648797524", 58.8, "2017-01-01");

        Book max=b1;
        if (b1.getPrice()>b2.getPrice()){
            max=b1;

        }else max=b2;
        if(max.getPrice()>b3.getPrice()){
            max=max;
        }else {
            max=b3;

        }
        max.showBook();

    }
}
