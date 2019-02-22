package lianxi1;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
         main();
    }
    public static int main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");  //100
        int num = scanner.nextInt();

        while (true) {
            int n = num % 10;   //  100
            System.out.print(n);   //0
            num=num/10;   //10
            if (num==0){
                break;
            }
    }return  num;
        }


    }




//  100%100=1     98  98/10=9%10