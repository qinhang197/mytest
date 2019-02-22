package lianxi7;


public class test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        USB usbMouse= new Mouse();
        computer.usbDevice(usbMouse);
        USB usbKeyboard=new Keyboard();
        computer.usbDevice(usbKeyboard);

        computer.powerOff();
    }

}
