package 结构型模式._01_Proxy.JDK动态代理;

import 结构型模式._01_Proxy.SellTickers;

/**
 * @ClassName TrainStation
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class TrainStation implements SellTickers {
    @Override
    public void sell() {
        System.out.println("火车站售票");
    }
}
