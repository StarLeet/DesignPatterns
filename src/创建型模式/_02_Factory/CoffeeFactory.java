package 创建型模式._02_Factory;

import 创建型模式._02_Factory.咖啡类群.Coffee;

public interface CoffeeFactory extends Factory{  //抽象工厂类为具体工厂制定标准
    Coffee ProcessBeans();   //咖啡工厂加工咖啡豆
}
