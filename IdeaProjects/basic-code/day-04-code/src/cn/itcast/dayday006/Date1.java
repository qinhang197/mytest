package cn.itcast.dayday006;

public class Date1 {
    public static void main(String[] args) {
        Date dates = new Date(1900, 1, 1);
        System.out.println("日期:" + dates.getYear() + "年" + dates.getMonth() + "月" + dates.getDay() + "日");
        if (dates.getYear() % 4 == 0 &&dates.getYear() % 400 == 0)
        {
            System.out.println(dates.getYear() + "年是闰年");
        }else {
            System.out.println(dates.getYear() + "年不是闰年");
        }

    }


}





