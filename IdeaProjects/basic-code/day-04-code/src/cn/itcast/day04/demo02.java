package cn.itcast.day04;

public class demo02 {
    public static void main(String[] args) {
        int a=8,b=6,c=10;

        int max=getMax(a,b,c);

        boolean b1=is(max,a,b,c);
        System.out.println(a+":"+c+":"+b+"是否可以组成直角三角形:"+b1);

    }
    public static int getMax(int a,int b,int c){
        int max=a>b?a:b;
        max=(max>c)?max:c;
        return max;
    }
    public  static  boolean  is(int max,int a,int b,int c){
        if(max==a){
         return     max*max==(b*b)+(c*c);
        }else if(max==b){
            return  max*max==(a*a)+(c*c);

        }else  if(max==c){
            return  max*max==(b*b)+(a*a);
        }
        return false;
    }
}
