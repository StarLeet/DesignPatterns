package 结构型模式._03_Decorator.装饰者类群;

import 结构型模式._03_Decorator.FastFood;

/**
 * @ClassName Garnish
 * @Description 抽象装饰者
 * @Author StarLee
 * @Date 2021/11/12
 */

public abstract class Garnish extends FastFood {
    //声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
