package cn.itcast.day031;

public class demo06 {
    public static void main(String[] args) {
        System.out.print("J");
        for (int i = 0; i <5; i++) {//0 1 2
            int key=i%3;
            switch (key){
                case 0:

                    System.out.print("a");
                    i++;
                    break;
                case 2:

                    System.out.print("V");


            }


        }

    }
}
