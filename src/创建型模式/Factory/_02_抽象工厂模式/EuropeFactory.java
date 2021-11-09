package 创建型模式.Factory._02_抽象工厂模式;

import 创建型模式.Factory.CoffeeFactory;
import 创建型模式.Factory.DessertFactory;
import 创建型模式.Factory.咖啡类群.Coffee;
import 创建型模式.Factory.咖啡类群.EuropeCoffee;
import 创建型模式.Factory.甜品类群.Dessert;
import 创建型模式.Factory.甜品类群.Trimisu;

/**
 * @ClassName EuporeFactory
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class EuropeFactory implements DessertFactory, CoffeeFactory {

    @Override
    public Dessert createDessert() {
        System.out.println("提拉米苏生产完成");
        return new Trimisu();
    }

    @Override
    public Coffee ProcessBeans() {
        System.out.println("欧洲产的咖啡豆研磨完成");
        return new EuropeCoffee("England");
    }
}
