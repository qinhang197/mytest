package practice08;

import java.util.Arrays;

// util 是一个与数组相关的工具类 提供了大量的静态方法 用来实现数组常见的方法
//  public static string tostring(数组)  将数组变成字符串 按照格式
//public static void sort(数组) 按照默认升序对数组的元素进行排序/
//如果是数值 sort按照升序从小到大\
//如果是字符串  就按照字母升序 对数组的元素进行排序
//如果是自定义类型 需要compare able***

/*public class arrays {
    public static void main(String[] args) {
        int [] arrays={10,20,30};
        String strs= Arrays.toString(arrays);
        System.out.println(strs);
        int []array1={0,2,3,1,5,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}*/
public  class arrays{
    public static void main(String[]args){
        String str="azfewfgr65624897876212013" ;
        //升序排列 必须是个数组
        char [] chars=str.toCharArray();
        Arrays.sort(chars);
        System.out.println(chars);
        for (int i = chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);

        }

    }

}


