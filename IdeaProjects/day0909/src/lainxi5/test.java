package lainxi5;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {


      suv suv1=new suv("1",5079,750000);
      suv suv2=new suv("1",4295,750000);
      suv suv3=new suv("1",4556,750000);
      ArrayList<suv> list =new ArrayList<>();
        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        for (int i = 0; i < list.size(); i++) {
            suv suvs=list.get(i);
            if (suvs.mid()){
                suvs.showMsg();
            }
        }

}
}
