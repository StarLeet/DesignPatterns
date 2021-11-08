package Factory.Method;

public class Main {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AisanFactory());
        coffeeStore.orderCoffee();
    }
}
