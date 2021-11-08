package Factory.Method;

public interface CoffeeFactory {  //抽象工厂类为具体工厂制定标准
    Coffee ProcessBeans();   //咖啡工厂加工咖啡豆
}
