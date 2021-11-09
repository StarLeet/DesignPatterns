package 设计原则._04_迪米特法则;

/**
 * @ClassName Star
 * @Description 明星类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Star {
    private String name;

    public Star(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
