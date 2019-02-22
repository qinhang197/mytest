package cn.itcast.demo03;
/*
1.方法应该定义在类当中 ,但不能在方法中定义方法.不能嵌套
2.方法定义的前后顺序无所  谓.
3.方法定义之后不会执行,如果希望执行必须写上return的返回值  不能没有
4.如果方法有返回值  那么必须写上return返回值 不能没有
        5.return 后面的返回值数据 必须个方法的返回值类型对应起来
        6.对于一个void  没有返回值的方法 不能写return后面的返回值 只能写return自己
        7.对于void方法中最后一行的return可以省略不写
        8.一个方法中可以有多个return语句 但是必须保证只有一个 会被执行到 两个return不能连写*/

public class Demo04MethodNotice {
    public static void main(String[] args) {
    }
    public static int method(){
        return 10;
    }
    public static void method2(){
        return;
    }
    public static void method3(){
        System.out.println("AAA");
        System.out.println("BBb");
        return;
    }
    public  static int getMax(int a,int b){
           /* int max;
            if(a>b){
                max=a;
            }else {
                max=b;
            }
            return max; */
        if(a>b){
            return a;
        }else return b;
    }

}
