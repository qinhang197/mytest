package lianxi07;

public class rectangle extends shape {
    public rectangle(int chang,int kuan) {
        super(chang,kuan,0);
    }

    public rectangle(int chang, int kuan, int r) {
        super(chang, kuan, r);
    }

    @Override
    public double mianji() {
        return getChang()*getKuan();
    }

    @Override
    public double zhouchang() {
        return 2*(getChang()+getKuan());
    }
}
