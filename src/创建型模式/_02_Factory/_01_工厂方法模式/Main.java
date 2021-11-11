package 创建型模式._02_Factory._01_工厂方法模式;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AsianFactory());
        coffeeStore.orderCoffee();
        CoffeeStore coffeeStore1 = new CoffeeStore(new EuropeFactory());
        coffeeStore1.orderCoffee();
    }
}
