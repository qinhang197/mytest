package lianxi07;

public class circle extends shape{
    public circle(int r) {
        super(0,0,r);
    }

    public circle(int chang, int kuan, int r) {
        super(chang, kuan, r);
    }

    @Override
    public double mianji() {

        return  Math.PI*getR()*getR();
    }

    @Override
    public double zhouchang() {
        return 2*Math.PI*getR();
    }
}
