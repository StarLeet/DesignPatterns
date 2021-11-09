package 创建型模式.Factory.咖啡类群;

import 创建型模式.Factory.咖啡类群.Coffee;

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
