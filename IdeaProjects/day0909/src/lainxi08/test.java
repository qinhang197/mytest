package lainxi08;

public class test {
    public static void main(String[] args) {
        gouwuche    gouwuche=new gouwuche();
        car cars=new car("电脑","g10000",7288);
        car cars2=new car("鼠标","g10002",728);
        car cars3=new car("键盘","g10003",788);
        car cars4=new car("耳机","g10004",72);
        System.out.println("=============================");
        gouwuche.addcar(cars);
        gouwuche.addcar(cars2);
        gouwuche.addcar(cars3);
        gouwuche.addcar(cars4);
        gouwuche.showcars();

        gouwuche.totalprice();
        System.out.println("============移除鼠标==========");
        gouwuche.remove(cars2);
        gouwuche.showcars();
        gouwuche.totalprice();

    }


}
