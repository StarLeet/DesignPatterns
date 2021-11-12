package 结构型模式._03_Decorator.装饰者类群;

import 结构型模式._03_Decorator.FastFood;

/**
 * @ClassName Bacon
 * @Description 培根类(具体装饰者)
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood,2,"培根");
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
