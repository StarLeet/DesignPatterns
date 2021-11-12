package 结构型模式._05_Facade;

/**
 * @ClassName Main
 * @Description 演示外观模式
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Main {
    public static void main(String[] args) {
        //创建智能音箱对象
        SmartAppFacade facade = new SmartAppFacade();
        //控制家电
        facade.say("打开家电");

        System.out.println("==================");

        facade.say("关闭家电");
    }
}
