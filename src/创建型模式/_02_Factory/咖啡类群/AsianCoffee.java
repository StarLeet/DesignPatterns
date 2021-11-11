package 创建型模式._02_Factory.咖啡类群;

public class AsianCoffee extends Coffee {
    public AsianCoffee(String country) {
        super.setCountry(country);
    }

    @Override
    public void addMilk() {
        System.out.println("加比例为3的牛奶");
    }

    @Override
    public void addSugar() {
        System.out.println("加比例为3的糖");
    }
}
