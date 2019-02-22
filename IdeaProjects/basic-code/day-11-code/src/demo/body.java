package demo;

public class body {         //外部
    public class heart {      //成员内部类
        public void beat() {

            System.out.println("心脏跳动");
            System.out.println("我叫"+name);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void methodBody() {
        System.out.println("外部类方法");
         heart heart=new heart();
         heart.beat();

    }
}
