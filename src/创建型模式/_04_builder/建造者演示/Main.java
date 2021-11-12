package 创建型模式._04_builder.建造者演示;

import 创建型模式._04_builder.建造者演示.建造者类群.AbstractBuilder;
import 创建型模式._04_builder.建造者演示.建造者类群.MobikeBuilder;
import 创建型模式._04_builder.建造者演示.建造者类群.OfoBuilder;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(AbstractBuilder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        if (builder instanceof OfoBuilder){
            System.out.println("Ofo自行车 " + bike.getFrame() + "  " + bike.getSeat());
        }else {
            System.out.println("摩拜自行车 " + bike.getFrame() + "  " + bike.getSeat());
        }
    }
}
