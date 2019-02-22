package test7;

public class test {
    public static void main(String[] args) {
        clerk Clerk = new clerk("李小亮", 5000, "F001");
        Manager manager = new Manager("张小强", 9000, "M001", 500);
        manager.show();
        Clerk.show();

        company Company = new company();
        for (int i = 1; i <=3; i++) {
            System.out.println("=========="+i+"月==========");
            Company.salay(manager);
            Company.salay(Clerk);
            manager.show();
            Clerk.show();
        }

    }
}
