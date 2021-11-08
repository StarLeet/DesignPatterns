package Factory.Method;

public class EuporeCoffee extends Coffee{
    public EuporeCoffee(String country) {
        super.setCountry(country);
    }

    @Override
    void addMilk() {
        System.out.println("加7分糖");
    }

    @Override
    void addSugar() {
        System.out.println("加7分牛奶");
    }
}
