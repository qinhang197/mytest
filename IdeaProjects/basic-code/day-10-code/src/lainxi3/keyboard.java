package lainxi3;

public class keyboard  implements  usb {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void colse() {
        System.out.println("关闭键盘");
    }
    public  void print(){
        System.out.println("键盘输入");
    }
}
