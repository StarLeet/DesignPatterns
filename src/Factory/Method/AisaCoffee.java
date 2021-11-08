package Factory.Method;

public class AisaCoffee extends Coffee{
    public AisaCoffee(String country) {
        super.setCountry(country);
    }

    @Override
    void addMilk() {
        System.out.println("加比例为3的牛奶");
    }

    @Override
    void addSugar() {
        System.out.println("加比例为3的糖");
    }
}
