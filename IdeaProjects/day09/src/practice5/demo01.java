package practice5;
/*
方法重写的注意事项
1.必须保证父子类的方法名称相同 参数列表也相同
@override : 写在方法前面 用来检测是否为正确的覆盖方法
子类的方法的返回值必须  小于等于父类方法的返回值范围
object;类是所有类的公共最好父类;
3.子类方法的权限必须 大于等于父类方法的权限修饰符 .
  PUBLIC PROTETECT DEFAULT PRAIVATE
    不是关键之default default什么都不写 留空

*/

public class demo01 {
    int num;

}
