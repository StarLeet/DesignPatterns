package 创建型模式._02_Factory._01_工厂方法模式;

import 创建型模式._02_Factory.CoffeeFactory;
import 创建型模式._02_Factory.咖啡类群.Coffee;

public class CoffeeStore {
    /*
    *  咖啡店完全从咖啡的生产中开脱出来,专注自己的服务
    *  1. 当咖啡店需要提供新的咖啡时,只需要传入新的工厂对象就可以了
    *  2. 新的咖啡生产直接开设新的工厂类就可以了,完全遵循开闭原则
    * */
    private final CoffeeFactory factory;  //根据构造器中传入的工厂,可以动态绑定具体生产咖啡豆

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public void orderCoffee(){
        Coffee coffee = factory.ProcessBeans();
        coffee.addMilk();
        coffee.addSugar();
    }
}
