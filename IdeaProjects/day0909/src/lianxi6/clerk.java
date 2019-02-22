package lianxi6;

public class clerk extends person   {
     private  String jingli ;

    public clerk(String jingli) {
        this.jingli = jingli;
    }

    public clerk(String name, String num, String bumen, String jingli) {
        super(name, num, bumen);
        this.jingli = jingli;
    }
    public  void show(){
        System.out.println(getBumen()+":"+getName()+",员工编号:"+getNum()+"\n 他的经理是:"+jingli);
    }
}
