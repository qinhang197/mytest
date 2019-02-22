package practice4;
/*
在父子类的继承关系当中,创建子类对象,访问成员方法的规则"
创建的对象是谁就优先用谁 如果没有则向上找 .
注意事项
无论是成员方法还是成员变量  如果没有都是向上找 绝不会向下找子类
重写 (Override)
在继承关系中 方法的名称一样 参数列表一样
重写是发生在继承关系当中 方法名称一样 参数列表也一样   覆盖
                        方法名称一样  参数列表不一样  重载
 方法的覆盖重写特点
 创建的是子类对象 则优先使用子类方法
 */
public class demo04 {
    public static void main(String[] args) {
     //   fu Fu=new fu();
       // Fu.methodfu();
      //  zi ZI=new zi();
      //  ZI.methodzi();

         zi ZI=new zi();
         //创建的是new 了子类对象 所以优先用子类方法 如果没有向上找
         ZI.method();
         fu FU= new fu();
         FU.method();
    }
}
