package cn.itcast.ti;

public class ti10 {
    public static void main(String[] args) {
        int a=10000;
        double rate=0.1;
        for (int year = 1;year <=20; year++) {
            System.out.println("第"+year+"年末"+"第"+year+getMoney(a,rate,year));

        }

    }
    public static int getMoney(int every,double rate,int year){
        double r=1;

        for (int i=0;i<year;i++){
            r*=(rate+1);
        }
        double f=every*(r-1)/rate;
        return (int)f;
    }
}
