package 结构型模式._01_Proxy.静态代理;

/**
 * @ClassName ProxyPoint
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class ProxyPoint {
    private static TrainStation station = new TrainStation();

    public static void sell(){
        System.out.println("代理点赚取小费");
        station.sell();
    }
}
