package test7;

public class company   implements Money {


    @Override
    public void salay(Employee emp) {
        System.out.println(emp.getCard()+emp.getMoney());
        if (emp instanceof Manager){
            Manager m= (Manager)  emp;
            double bounds=m.getBounds();
            m.setCard(m.getCard()+bounds);

        }
    }
}
