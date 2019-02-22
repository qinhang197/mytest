package cn.itcast.day05;

public class demo03array {
    public static void main(String[] args) {


    int [] array={1,2,3,};
    // 静态初始化的标准格式,可以拆分成两个步骤.
    int [] arrayB;
    arrayB= new int[]{1,2,3};
    // 动态初始化也可以拆分成两个步骤;
        int [] arrayC;
        arrayC= new int [5];
        //静态初始化一旦使用省略模式, 就不能拆分成两个步骤了
       /* int[] arrayD;
        arrayD={1,2,3,4};*/
       //不确定数组当中的具体内容,用动态初始化;否则,已经确定了具体的内容,用静态初始化

    }
}

