package lainxi3;

public class mouse implements  usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void colse() {
        System.out.println("关闭鼠标");

    }
    public  void click(){
        System.out.println("鼠标点击");
    }
}
