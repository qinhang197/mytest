package practice08;

public class dayday8 {
    public static void main(String[] args) {

        String str="HelloWorld";
        String str2="helloworld";
        String str1="lovejava";
        System.out.println(str.equals(str1));//false
        System.out.println(str.equalsIgnoreCase(str2)); //true
        System.out.println(str1.length()); //8
        System.out.println(str.concat(str1)); // HelloWorldlovejava
        System.out.println(str.charAt(2));// l
        System.out.println(str.indexOf("e"));   //?????????????????
        System.out.println(str.substring(5));  //world
        System.out.println(str.substring(4,7));   //owo
        String str3=" How do you do?";
        String str4=str3.replace("o","*");   //  h*w d* y*u d*?
        System.out.println(str4);
        String str5="abc,def,gho,len,max";
        String [] str6=str5.split(",");
        for (int i = 0; i < str6.length; i++) {
            System.out.print(str6[i]+" ");
            System.out.println();
        }
        String  str8="abcdefghijk";
        char [] chars= str8.toCharArray();
        System.out.println(chars);




    }

}


