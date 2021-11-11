package 创建型模式._02_Factory.咖啡类群;

public class EuropeCoffee extends Coffee {
    public EuropeCoffee(String country) {
        super.setCountry(country);
    }

    @Override
    public void addMilk() {
        System.out.println("加7分糖");
    }

    @Override
    public void addSugar() {
        System.out.println("加7分牛奶");
    }
}
