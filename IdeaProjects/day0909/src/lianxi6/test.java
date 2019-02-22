package lianxi6;

public class test {
    public static void main(String[] args) {
        manager manager=new manager("张小强","M001","销售部","李小亮");
        clerk clerk=new clerk("李小亮","c001","销售部","张小强");
        manager.show();
        clerk.show();
    }

}
