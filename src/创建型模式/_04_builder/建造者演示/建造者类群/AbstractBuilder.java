package 创建型模式._04_builder.建造者演示.建造者类群;

import 创建型模式._04_builder.建造者演示.Bike;

/**
 * @ClassName AbstractBuilder
 * @Description 抽象建造者类
 * @Author StarLee
 * @Date 2021/11/10
 */

public abstract class AbstractBuilder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
