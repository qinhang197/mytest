package lainxi3;

public class computer {
    public void poweron() {
        System.out.println("笔记本开机");
    }

    public void poweroff() {
        System.out.println("笔记本关机");
    }

    public void usbdevice(usb USB) {
        USB.open();  //打开设备
        if (USB instanceof mouse) {
            mouse Mouse = (mouse) USB;
            Mouse.click();
        }
        if (USB instanceof keyboard) {
            keyboard Keyboard = (keyboard) USB;
            Keyboard.print();

        }
        USB.colse();
    }
    //关闭设备
}
