package test3;

import java.sql.SQLOutput;

public interface A {
    public abstract void showA();

    private static void show10(String str) {
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
        }
    }

    public static void showB10() {
        System.out.print("Staic BBBB");
        System.out.println();
        show10("BBBB ");
        System.out.println();
    }

    public static void showC10() {
        System.out.print("Staic CCCC");
        System.out.println();
        show10(" CCCC");
        System.out.println();
    }


}

