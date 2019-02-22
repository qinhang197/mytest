package demo04;

public class hero  {
    private String  name;
    private  Skill skill;

    public hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public hero() {

    }
        public  void attack(){
            System.out.print(name+"正在放");
            skill.use();
            System.out.println("释放完成");
        }
}
