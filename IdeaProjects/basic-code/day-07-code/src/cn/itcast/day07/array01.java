package cn.itcast.day07;

public class array01 {
    public static void main(String[] args) {
        array[] a=new array[3];  //定义的数组

        array one=new array(18,"迪丽热巴");
        array two=new array(18,"古力娜扎");
        array three=new array(18,"马尔扎哈");
        a [0]=one;
        a [1]=two;
        a [2]=three;// 赋值到数组的0号元素位置.
        System.out.println( a[0].getAge()+a[0].getName());
        System.out.println( a[1].getAge()+a[1].getName());
        System.out.println( a[2].getAge()+a[2].getName());

    }
}
