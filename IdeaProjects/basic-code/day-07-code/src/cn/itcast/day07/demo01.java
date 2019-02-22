package cn.itcast.day07;
//  匿名对象  只有右边的对象 没有左边的名字和赋值运算符;
// 匿名对象 只能使用唯一一次 下次再用不得不在创建.
//如果确定有一个对象只使用唯一的一次 就可以用匿名对象.
public class demo01 {
    public static void main(String[] args) {
        person one =new person();
        one.name="王思聪";
        one.showname();
        System.out.println("-------------");
        new person().name="赵又廷";
        new person().showname();
    }
}
