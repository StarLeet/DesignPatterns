package 结构型模式._03_Decorator.装饰者类群;

import 结构型模式._03_Decorator.FastFood;

/**
 * @ClassName Egg
 * @Description 具体装饰者
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Egg extends Garnish {
    public Egg(FastFood fastFood) {
        super(fastFood,1,"鸡蛋");
    }

    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
