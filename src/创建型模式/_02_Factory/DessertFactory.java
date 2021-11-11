package 创建型模式._02_Factory;

import 创建型模式._02_Factory.甜品类群.Dessert;

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
