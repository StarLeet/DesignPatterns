package 创建型模式._02_Factory;

import 创建型模式._02_Factory.咖啡类群.Coffee;
import 创建型模式._02_Factory.甜品类群.Dessert;

/**
 * @InterFaceName Factory
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */
public interface Factory {
    Coffee processBeans();   //咖啡工厂加工咖啡豆
    Dessert createDessert();  //生产甜品的功能
}
