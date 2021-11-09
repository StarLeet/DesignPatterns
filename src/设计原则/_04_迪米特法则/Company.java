package 设计原则._04_迪米特法则;

/**
 * @ClassName Company
 * @Description 公司类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public Company(String name) {
        this.name = name;
    }
}
