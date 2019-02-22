package cn.itcast.ti;

public class ti9 {
    public static void   main(String[] args) {
        int a=5,b=4,c=3;
        int max=getMax(a,b,c);
        boolean b1=is(max,a,b,c);
        System.out.println(a+":"+b+":"+c+":能否组成直角三角形:"+b1);
    }
        public static int getMax(int a, int b, int c){
            int max=(a>c)?a:b;
            max =(max>b)?max:b;
            return max;
        }
        public static int  getMin(int a,int b, int c){
            int min=(a<c)?a:b;
            min=(min<b)?min:b;
            return min;
        }
        public static boolean is(int max,int a,int b,int c){
            if(a==max){
                return max*max==b*b+c*c;
            }else if(b==max){
                return max*max==a*a+c*c;
            }else if(c==max){
                 return max*max==b*b+a*a;
            }return false;
        }

}
