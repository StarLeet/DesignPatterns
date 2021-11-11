package 结构型模式._01_Proxy.JDK动态代理;

import 结构型模式._01_Proxy.SellTickers;

/**
 * @ClassName Main
 * @Description 演示JDK动态代理模式
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    public static void main(String[] args) {
        //获取代理对象
        //1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickers proxyObject = factory.getProxyObject();
        //3.调用卖调用的方法
        proxyObject.sell();
        /*
            ProxyFactory中的
        *   public Object invoke(Object proxy, Method method, Object[] args)
        *   将proxyObject作为Object,sell作为Method传入invoke方法中
        *   也就是说JDK动态代理无论如何底层都是调用到invoke方法的
        * */
        System.out.println(proxyObject.getClass());
    }
}
