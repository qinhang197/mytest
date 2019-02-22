package lianxi2;
/*
从java 开始 接口允许定义静态方法 .
 格式:
 public static 返回值类型 方法名称 (参数列表){方法体}
提示 就是讲abstract 或者default换成static;  并且带上方法体
 */
public interface mystatic {
    public  static void method(){
        System.out.println("这是接口的静态方法");
    }
}
