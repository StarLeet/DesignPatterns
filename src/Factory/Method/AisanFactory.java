package Factory.Method;

public class AisanFactory implements CoffeeFactory{
    @Override
    public Coffee ProcessBeans() {
        System.out.println("亚洲产的咖啡豆研磨完成");
        return new AisaCoffee("China");
    }
}