package cn.itcast.person;

public class person {
     String name ;
     // 参数是对方的名字
    //name 是自己的名字  通过谁调用的方法  谁就是this
       public void sayHello( String name  ){
           System.out.println(name+" 你好,我是:"+this.name);
       }

//this 是给成员变量用的

}
