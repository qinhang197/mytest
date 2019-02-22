package lianxi6;

public class person {
    private String name;
    private  String num;
    private  String bumen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBumen() {
        return bumen;
    }

    public void setBumen(String bumen) {
        this.bumen = bumen;
    }

    public person() {

    }

    public person(String name, String num, String bumen) {

        this.name = name;
        this.num = num;
        this.bumen = bumen;
    }
    public  void show(){
        System.out.println(bumen+":"+name+",员工编号:"+num);
    }
}
