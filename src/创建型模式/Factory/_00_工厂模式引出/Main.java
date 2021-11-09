package 创建型模式.Factory._00_工厂模式引出;

import 创建型模式.Factory.咖啡类群.Coffee;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {
    public static void main(String[] args) {
        //1,创建咖啡店类
        CoffeeStore store = new CoffeeStore();
        //2,点咖啡
        Coffee coffee = store.orderCoffee("EuporeCoffee");

        System.out.println(coffee.getCountry());
    }
}
