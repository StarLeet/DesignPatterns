package 结构型模式.cglib动态代理;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    public static void main(String[] args) {
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        // 3. 调用代理对象中的sell方法卖票
        proxyObject.sell();
        System.out.println(proxyObject.getClass());
    }
}
