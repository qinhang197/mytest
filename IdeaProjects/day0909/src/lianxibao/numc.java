package lianxibao;

public class numc extends numb {
    int numcc=30;
    @Override
    public void showA(){
        System.out.println("A类中的numa:"+numaa);
    }
    @Override
    public void showB(){
        System.out.println("B类中的numb:"+numbb);

    }

    public void showC(){
        System.out.println("B类中的numc:"+this.numcc);

    }

}
