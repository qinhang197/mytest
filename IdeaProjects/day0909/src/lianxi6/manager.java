package lianxi6;

public class manager extends person {
    private String job;

    public manager(String job) {
        this.job = job;
    }

    public manager(String name, String num, String bumen, String job) {
        super(name, num, bumen);
        this.job = job;
    }
    public void show(){
        System.out.println(getBumen()+":"+getName()+",员工编号:"+getNum()+"\n他的职员是:"+job);
    }
}
