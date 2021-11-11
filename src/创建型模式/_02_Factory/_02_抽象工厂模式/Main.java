package 创建型模式._02_Factory._02_抽象工厂模式;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AsianFactory());
        coffeeStore.orderCoffee();
        coffeeStore.orderDessert();

        System.out.println("============");
        CoffeeStore coffeeStore1 = new CoffeeStore(new EuropeFactory());
        coffeeStore1.orderCoffee();
        coffeeStore1.orderDessert();
    }
}
