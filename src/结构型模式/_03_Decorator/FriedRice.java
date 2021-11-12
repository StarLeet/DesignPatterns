package 结构型模式._03_Decorator;

/**
 * @ClassName FriedRice
 * @Description 具体构件
 * @Author StarLee
 * @Date 2021/11/12
 */

public class FriedRice extends FastFood {
    public FriedRice() {
        super(10,"炒饭");
    }

    public float cost() {
        return getPrice();
    }
}
