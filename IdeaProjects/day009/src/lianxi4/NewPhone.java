package lianxi4;

public class NewPhone extends phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
