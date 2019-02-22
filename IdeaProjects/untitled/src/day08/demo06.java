package day08;


import java.util.ArrayList;

public class demo06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("bca");
        list.add("dadfa");
        list.add("dddaaa");
        list.add("你好啊");
        list.add("我来啦,你干嘛呢");
        list.add("别跑啊");
        System.out.println(list);

        System.out.println("================");
        ArrayList<String> newlist = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.length() > 5) {
                newlist.add(str);
            }
        }
            list.remove(newlist);
            System.out.print(newlist);



        //  String lists=str.replace(str,"");


    }
}
