package cn.itcast.ti;

public class ti4 {
    public static void main(String[] args) {
        color1("red");
        color1("blue");

    }
    public static void color1(String color){
        switch (color){
            case "red":
                System.out.println(color+"是红色!");
                break;
            case "blue":
                System.out.println(color+"是蓝色!");
                break;

        }
    }


}
