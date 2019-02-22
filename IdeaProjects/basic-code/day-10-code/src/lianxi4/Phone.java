package lianxi4;

public class Phone implements USB {
    @Override
    public void transfer() {
        System.out.println("使用USB线传输数据");
    }

}
