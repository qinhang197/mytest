package cn.itcast.dayday006;

public class cat2 {
    public static void main(String[] args) {

        cat c2=new cat(5,'白');
        cat c1=new cat(5,'黑');

        c1.showMsg();
        c2.showMsg();
        boolean equals=equals(c1,c2);
        System.out.println("属性相同?"+equals);
        System.out.println("***********************");

        cat c3=new cat(3,'黄');
        cat c4=new cat(3,'黄');
        c3.showMsg();
        c4.showMsg();
        boolean equals1=equals(c3,c4);
        System.out.println("属性相同?"+equals1);





    }
    public static boolean equals(cat c1,cat c2){
        return c1.getAge()==c2.getAge()&&c1.getColor()==c2.getColor();
    }
}
