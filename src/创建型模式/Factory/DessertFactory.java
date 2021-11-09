package 创建型模式.Factory;

import 创建型模式.Factory.咖啡类群.Coffee;
import 创建型模式.Factory.甜品类群.Dessert;

/**
 * @InterFaceName DessertFactory
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */
public interface DessertFactory extends Factory{
    //生产甜品的功能
    Dessert createDessert();
}
