package lianxi1;

public class Body {
    public  class Heart{
        public  void beat(){
            System.out.println("心脏跳动");
        }
    }
    public  void methodBody(){
        System.out.println("外部类方法");
        Heart heart=new Heart();
        heart.beat();
}
}
