package cn.itcast.day05;
//s使用动态初始化的时候 其中的元素将会自动拥有一个默认的
    /*如果是整型 那么默认为0;
    如果是浮点型 那么默认为0.0;
    如果是字符类型 那么默认为 '\u0000';
    如果是布尔类型  那么默认为 false
    如果是引用类型  那么默认为null.
    静态出事话其实有默认值得过程,只不过系统自动马上将默认值替换成为了大括号里的具体数值

     */
public class demo05arrayuse {
    public static void main(String[] args) {
        int[]array=new int[3];
        System.out.println(array[0]);
        System.out.println("=======================");
        int[] arrayA=new int[3];
        arrayA[1]=123;
        System.out.println(arrayA[1]);
    }
}
