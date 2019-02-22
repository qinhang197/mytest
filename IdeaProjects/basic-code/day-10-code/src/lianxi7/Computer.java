package lianxi7;



public class Computer {
     public  void powerOn(){
         System.out.println("打开笔记本电脑");

     }
     public  void powerOff(){
         System.out.println("关闭笔记本电脑");

     }
     public  void usbDevice(USB usb){
         usb.open();
         if (usb instanceof Mouse){
            Mouse mouse=(Mouse)usb;
             mouse.click();
         }
         if (usb instanceof Keyboard){
            Keyboard keyboard= (Keyboard)usb;
             keyboard.type();
         }
         usb.close();

     }
}
