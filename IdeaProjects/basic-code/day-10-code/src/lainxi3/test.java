package lainxi3;

public class test {
    public static void main(String[] args) {
        //创建一个笔记本电脑
       computer com=new computer();
        com.poweron();
        //准备一个鼠标供电脑使用
        //向上转型
       usb usbmouse = new mouse();  // 多态写法
       com.usbdevice(usbmouse);     //参数是usb类型
        //准备一个键盘
        keyboard keyboard=new keyboard();
        com.usbdevice(keyboard);

        com.poweroff();

    }

}
