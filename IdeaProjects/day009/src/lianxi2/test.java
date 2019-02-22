package lianxi2;

public class test {
    public static void main(String[] args) {
        Fu fu   =new Fu();
        System.out.println(fu.num);   //成员变量num
        fu.methodFu();          //成员方法 methodfu
        System.out.println("===================");
        Zi zi=new Zi();
        System.out.println(zi.num);    // 成员变量 num
        zi.methodZi();              //成员方法 methodzi
        zi.methodFu();              //该方法优先使用父类
    }

}
