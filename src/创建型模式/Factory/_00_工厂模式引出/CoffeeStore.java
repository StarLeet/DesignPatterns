package 创建型模式.Factory._00_工厂模式引出;


import 创建型模式.Factory.咖啡类群.AsianCoffee;
import 创建型模式.Factory.咖啡类群.Coffee;
import 创建型模式.Factory.咖啡类群.EuropeCoffee;

/**
 * @ClassName CoffeeStore
 * @Description 咖啡店
 * @Author StarLee
 * @Date 2021/11/8
 */

public class CoffeeStore {
    /*
    * 没有工厂模式的情况下,咖啡店类需要自己生产咖啡
    * 1. 咖啡店是众多的(美团的、饿了么的、万达的)
    * 2. 众多的咖啡类都处理自己的咖啡生产流程
    * 3. 而且一个咖啡店内部需要生产咖啡的时候还得大量修改orderCoffee方法,违背了开闭原则
    * */
    public Coffee orderCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("AisaCoffee".equals(type)) {
            coffee = new AsianCoffee("美国");
        } else if("EuporeCoffee".equals(type)) {
            coffee = new EuropeCoffee("韩国");
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
