package practice08;
/*
代码块的格式
public class 类名称{
  static   {
  }
  }
 */
public class person {
    static{
        System.out.println(" 静态代码块执行!");
    }
    public person() {
        System.out.println("构造方法执行");
    }
}
