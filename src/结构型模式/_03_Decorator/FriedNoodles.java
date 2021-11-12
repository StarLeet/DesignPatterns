package 结构型模式._03_Decorator;

/**
 * @ClassName FriedNoodles
 * @Description 具体构件
 * @Author StarLee
 * @Date 2021/11/12
 */

public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(12,"炒面");
    }

    public float cost() {
        return getPrice();
    }
}
