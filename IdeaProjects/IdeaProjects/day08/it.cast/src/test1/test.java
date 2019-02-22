package test1;

import java.util.WeakHashMap;

public class test {
    public static void main(String[] args) {
        int  morning=21,afternoon=39,everning=25,date=26;
        String weather="晴";
        System.out.println("===========交通信息综合大屏=============");
        System.out.println("今日天气"+ weather);
      int max= morning>afternoon?morning:afternoon;
       max=max>everning?max:everning;
        System.out.println("最高气温:"+max+"度");
        int min= morning<afternoon?morning:afternoon;
        min=min<everning?min:everning;
        System.out.println("最低气温:"+min+"度");
        if(max>38){
            System.out.println("气象预警:今日高温请做好防暑降温工作");
        }else {
            System.out.println("气象预警:今日无预警");
        }
        String num1="0,2,4,6,8";
        String num2="1,3,5,7,9";
        if(date%2==0){
            System.out.println("今日限行:"+num1);
        }else {
            System.out.println("今日限行:"+num2);
        }
        System.out.println("========================================");
    }



}
