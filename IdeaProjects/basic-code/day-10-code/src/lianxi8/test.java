package lianxi8;

public class test {
    public static void main(String[] args) {
        Computer computer= new Computer();
        computer.powerOn();
       // USB USBMOUSE=new Mouse();
        computer.useDevice(new Mouse());
      //  USB USBKEYBOARD =new Keyboard();
        computer.useDevice(new Keyboard());

        computer.powerOff();
    }
}
