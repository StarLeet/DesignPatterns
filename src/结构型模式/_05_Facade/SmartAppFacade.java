package 结构型模式._05_Facade;

import 结构型模式._05_Facade.智能家具类群.AirCondition;
import 结构型模式._05_Facade.智能家具类群.Light;
import 结构型模式._05_Facade.智能家具类群.TV;

/**
 * @ClassName SmartAppFacade
 * @Description 外观类，用户主要和该类对象进行交互
 * @Author StarLee
 * @Date 2021/11/12
 */

public class SmartAppFacade {
    //聚合电灯对象，电视机对象，空调对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    //通过语言控制
    public void say(String message) {
        if(message.contains("打开")) {
            on();
        } else if(message.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }

    //一键打开功能
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    //一键关闭功能
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
