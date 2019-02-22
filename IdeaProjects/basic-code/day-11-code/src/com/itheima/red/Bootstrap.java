package com.itheima.red;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed myRed = new MyRed("发红包");
        myRed.setOwnerName("王思聪");
//   NormalMode normal= new NormalMode();
//        myRed.setOpenWay(normal);

        OpenMode random=new RandomMode();

        myRed.setOpenWay(random);
    }

}