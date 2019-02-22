package lianxi4;

public class test {
    public static void main(String[] args) {
        student student=new student(15,"李小乐",90);

        teacher teacher=new teacher(30,"王小平","java");
        teacher.teach();
        student.score();
    }
}
