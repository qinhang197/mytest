package lianxi4;

public interface USB {
    public default void transfer(){
        System.out.println("通过USB插口传输数据");
    }

}

