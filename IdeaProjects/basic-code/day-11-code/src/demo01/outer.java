package demo01;

public class outer {
    public  void methodA(){
         class inner{       //局部内部类
             int num=10;
            public  void    methodB(){
                System.out.println(num);

            }
        }
        inner inners= new inner();
         inners.methodB();
    }
}
