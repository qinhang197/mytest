package demo02;

public class Outer {
    public void methodOuter() {
        class Inner {
            int num = 10;

            public void methodInnner() {
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInnner();
    }
}
