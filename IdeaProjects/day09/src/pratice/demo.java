package pratice;

public class demo {
    public static void main(String[] args) {
        teacher teacher =new teacher();
        teacher.method();
        //子类虽然什么都没写 但是会继承来自父类的method;
        Assistant assistant=new Assistant();
        assistant.method();
    }
}
