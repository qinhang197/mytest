package lainxi1;
/*
1.接口的默认方法,可以通过实现类对象,直接调用
2.接口的默认方法 也可以被接口实现类 进行覆盖重写
 */

public class aaa {
    public static void main(String[] args) {
        mydefaultA a = new mydefaultA();
        a.methods();

        a.methods3();
        mydefaultB b=new mydefaultB();
        b.methods();
        b.methods3();


    }
}

