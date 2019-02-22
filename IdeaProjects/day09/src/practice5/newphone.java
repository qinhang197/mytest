package practice5;

public class newphone extends phone {
    @Override
    public void show() {
        super.show();// 把父类的show 方法拿过来利用
        System.out.println("显示号码");
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
