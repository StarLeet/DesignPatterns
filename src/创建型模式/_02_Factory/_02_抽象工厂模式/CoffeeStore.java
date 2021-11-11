package 创建型模式._02_Factory._02_抽象工厂模式;

import 创建型模式._02_Factory.CoffeeFactory;
import 创建型模式._02_Factory.DessertFactory;
import 创建型模式._02_Factory.Factory;
import 创建型模式._02_Factory.咖啡类群.Coffee;
import 创建型模式._02_Factory.甜品类群.Dessert;

public class CoffeeStore {
    /*
    *   抽象工厂对于工厂方法的区别在于抽象工厂不专注于生产某一个产品
    *   而在于某一个产品族,比如安踏工厂生产安踏系列的产品
    *   但是其不符合开闭原则，新的产品加入会修改所有相关工厂类
    * */

    private final Factory factory;  //根据构造器中传入的工厂,可以动态绑定具体生产咖啡豆

    public CoffeeStore(Factory factory) {
        this.factory = factory;
    }

    public void orderCoffee(){
        Coffee coffee = ((CoffeeFactory)factory).ProcessBeans();
        coffee.addMilk();
        coffee.addSugar();
    }

    public void orderDessert(){
        Dessert dessert = ((DessertFactory)factory).createDessert();
    }
}
