package 结构型模式._03_Decorator;

import 结构型模式._03_Decorator.装饰者类群.Bacon;
import 结构型模式._03_Decorator.装饰者类群.Egg;

/**
 * @ClassName Main
 * @Description 演示装饰者模式
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Main {
    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();

        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("===============");

        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================");
        //再加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================");
        food = new Bacon(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");
    }
}
