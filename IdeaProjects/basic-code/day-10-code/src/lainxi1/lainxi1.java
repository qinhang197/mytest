package lainxi1;
/*
在任何版本的java中 接口都可以定义抽象方法
public abstract 返回值类型 方法名称(参数列表);
 注意事项:接口当中的抽象方法 修饰符必须是两个固定的关键字 public abstact
2.这两个关键字修饰符可以选择性省略.
3.方法的三要素可以随意定义.0
 接口的使用步骤:
 1.接口不能直接使用,必须有一个 实现类 实现该接口 .
 格式:  public class 实现类名称 implements 接口名称{};
 2.接口的实现类 必须覆盖重写 接口的所有抽象 方法
  实现:去掉abstract 关键字 加上方法体大括号
 3.创建实现类的对象,进行使用.
 4.创建实现类的对象进行使用
 注意事项
 如果实现类并没有覆盖重写接口的所有抽象方法 这个实现类自己就必须是抽象类
 */

public interface lainxi1 {
    public abstract  void  method1();
    //这也是抽象方法
    public abstract  void  method2();
    //这也是抽象方法
    public  void  method3();
    //这也是抽象方法
     void  method();

}
