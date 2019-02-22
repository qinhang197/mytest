package Test.day07;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("张三丰");
        list.add("张三丰2");
        list.add("张三丰3");
        list.add("张三丰4");
        System.out.println(list);
        print(list);

    }
    public  static void print(ArrayList<String>list){
        System.out.println(list);
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name=list.get(i);
            if (i==list.size()-1){
                System.out.println(name+"}");
            }else System.out.print(name+"@");

            
        }
    }
}
