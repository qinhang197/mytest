package cn.itcast.ti;

import javax.sound.midi.MidiChannel;

public class G {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=10;
        int Max=getMax(a,b,c);
        int Mid=getMid(a,b,c);
        int Min=getMin(a,b,c);
        boolean b1=get(Max,Mid,Min);
        System.out.println(b1);

    }
    public  static int getMax(int a,int b,int c){
        int Max=a>b?a:b;
            Max=Max>c?Max:c;
            return Max;

    }
    public static int getMid(int a,int b,int c){
        int Mid=a>b?a:b;
            Mid=Mid<c?Mid:c;
            return Mid;
    }
    public static int getMin(int a,int b,int c){
        int Min=a<b?a:b;
            Min=Min<c?Min:c;
            return Min;
    }
    public static boolean  get(int Max,int Mid,int Min){
        if(Max*Max==Mid*Mid+Min*Min){
            return  true;

        }return  false;
    }
}
