package practice;
// 在父子类的继承关系当中 如果成员变量重名 则创建子类对象时 访问有两种方式
// 直接访问   直接通过子类对象访问的成员变量 等号左边是谁 就优先用谁 没有则向上找
//间接访问  简介通过成员方法访问成员变量
//  该方法属于谁就优先用谁  没有就向上找

public class demo01 {
    public static void main(String[] args) {
        fu Fu=new fu();   //创建父类对象
        System.out.println(Fu.numfu);  //只能使用父类的内容     没有任何子类的内容
        zi Zi= new zi();
      //  System.out.println(Zi.numzi);
      //  System.out.println(Zi.numfu);





        //  等号左边是谁 就优先用谁
        System.out.println(Zi.num);  //优先子类  120

            // 这方法hi子类的  优先用子类的 没有在往上找
        Zi.methodzi();
        //在父类的方法中定义的
        Zi.methodfu();

    }
}

