package cn.itcast.dayday006;

public class Book {
    private String num;
    private String name;
    private String ISBN;
    private double price;
    private String date;

    public Book(String num, String name, String ISBN, double price, String date) {
        this.num = num;
        this.name = name;
        this.ISBN = ISBN;
        this.price = price;
        this.date = date;
    }

    public Book() {

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showBook() {
        System.out.println("最贵的书是:" + getNum() + "," + getName() + "," + getISBN() + "," + getPrice() + "," + getDate());

    }
}
