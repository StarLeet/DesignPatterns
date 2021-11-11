package 创建型模式._04_builder.建造者演示;

/**
 * @ClassName OfoBuilder
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class OfoBuilder extends AbstractBuilder{
    @Override
    public void buildFrame() {
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
