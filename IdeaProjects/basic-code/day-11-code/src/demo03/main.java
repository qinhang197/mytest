package demo03;

/*
如果接口类的实现类或者是父类的子类只需要唯一的一次
那么这种情况下就可以省略掉该定义,而改为使用(匿名内部类);
匿名内部类的定义格式:
接口名称 对象名 =new  接口名称 ();
 */
public class main {

    public static void main(String[] args) {
        MyInterface objs = new MyInterface() {
            @Override
            public void method2() {
                System.out.println("1");

            }

            @Override
            public void method1() {
                System.out.println("2");
            }


        };
        objs.method1();
        objs.method2();
        System.out.println("=================");
        new MyInterface() {
            @Override
            public void method2() {
                System.out.println("22");
            }

            @Override
            public void method1() {
                System.out.println("33");
            }
        }.method1();
        new MyInterface() {
            @Override
            public void method2() {
                System.out.println("22");
            }

            @Override
            public void method1() {
                System.out.println("33");
            }
        }.method2();
        //因为匿名对象无法调用第二次方法,
        // 所以需要在创建一个匿名内部类的匿名对象
        //匿名内部类是省略得了实现类子类,但是匿名对象时省略了对象名称//
        //强调:匿名内部类和匿名对象不是一回事;
    }


}

