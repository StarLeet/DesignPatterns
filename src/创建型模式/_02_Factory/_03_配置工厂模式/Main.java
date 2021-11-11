package 创建型模式._02_Factory._03_配置工厂模式;

import 创建型模式._02_Factory.咖啡类群.Coffee;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.processBeans("Asian");
        coffee.addMilk();
        System.out.println(coffee.getCountry());

        System.out.println("=============");
        Coffee coffee1 = CoffeeFactory.processBeans("Europe");
        coffee1.addMilk();
        System.out.println(coffee1.getCountry());
    }
}
