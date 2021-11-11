package 创建型模式._04_builder.建造者演示;

/**
 * @ClassName Director
 * @Description 指挥者类,用于指定构建顺序
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Director {
    private final AbstractBuilder mBuilder;

    public Director(AbstractBuilder builder) {
        mBuilder = builder;
    }

    public Bike construct() {   //construct方法 规定顺序
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        return mBuilder.createBike();
    }
}
