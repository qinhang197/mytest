package cn.itcast.day.demo02;
// 你帮我算  算完以后求结果.
public class Demo01MethodReturn {
    public static void main(String[] args) {
        int num=getSum(10,20);
        System.out.println("返回值是:"+ num);
        printsum(100,200);

        System.out.println("============= =");
        System.out.println(getSum(1,2));
        getSum(3,5 );

        System.out.println("==============");
    //对于没有反回值的方法,只能单独,不能打印和赋值
       // System.out.println(printsum(2,3));
        // 上面赋值
    // 注意是事项
        //对于有返回值的 可以单独调用 打印调用和赋值调用
        //对于没有返回值的 只能单独调用 不能打印调用或者赋值调用

    }
    public  static  int getSum(int a,int b){
        int result=a+b;
        return result;
    }
    public  static void printsum(int a,int b){
        int result=a+b;
        System.out.println("结果是"+result);
    }


}