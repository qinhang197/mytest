package cn.itcast.dayday006;

public class card {
    private String hs;
    private String ds;

    public card(String hs,String ds) {
        this.hs = hs;
        this.ds = ds;
    }
    public void  showcard(){
        System.out.println(hs+ds);
    }
}

