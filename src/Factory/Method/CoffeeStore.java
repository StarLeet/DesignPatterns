package Factory.Method;

public class CoffeeStore {
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
