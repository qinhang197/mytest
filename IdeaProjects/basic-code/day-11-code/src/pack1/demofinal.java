package pack1;

public class demofinal {
    public  class Heart{    //成员内部类
        public void heart() {
            System.out.println("=========");
            System.out.println(name);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public void Body() {  //外部类方法
         Heart heart=new Heart();
         heart.heart();
        System.out.println("=========");
    }

}
