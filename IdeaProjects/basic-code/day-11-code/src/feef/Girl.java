package feef;

public class Girl {

        String name;
    }

    class Boy {
        String name;
        Girl girl;
        public void kiss() {
            System.out.println(name + "正在亲吻" + girl.name);
        }
    }

