package lainxi08;

import java.util.ArrayList;

public class gouwuche {
    ArrayList<car> list=new ArrayList<>();
    public gouwuche(){
    }
    public  void addcar(car cars ){
        list.add(cars);
    }
    public  void showcars(){
        System.out.println("您选购的商品为:");
        for (int i = 0; i < list.size(); i++) {
            car cars= list.get(i);
            cars.show();
        }
    }
    public void remove(car cars){
        list.remove(cars);
    }
    public void totalprice(){
        double sum=0;
        for (int i = 0; i < list.size(); i++) {
            car cars=list.get(i);
            sum+=cars.getPrice();

        }
        System.out.println("总计有"+sum+"元");
    }
}
