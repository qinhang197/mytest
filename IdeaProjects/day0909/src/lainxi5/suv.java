package lainxi5;

public class suv extends atuo {

    public suv() {
    }

    public suv(String type, double length, double price) {
        super(type, length, price);
    }

    private int minlength = 4925;
    private int midlength = 5070;

    public boolean min() {
        return getLength() <= minlength;
    }

    public boolean mid() {
        return getLength() <= midlength;
    }

    public boolean max() {
        return getLength() <= midlength && getLength() > minlength;
    }


}
