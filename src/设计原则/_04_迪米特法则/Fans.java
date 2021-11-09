package 设计原则._04_迪米特法则;

/**
 * @ClassName Fans
 * @Description 粉丝类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Fans {
    private String name;

    public String getName() {
        return name;
    }

    public Fans(String name) {
        this.name = name;
    }
}
