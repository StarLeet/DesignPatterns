package 创建型模式._04_builder.建造者演示;

/**
 * @ClassName MobikeBuilder
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class MobikeBuilder extends AbstractBuilder{
    @Override
    public void buildFrame() {
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
