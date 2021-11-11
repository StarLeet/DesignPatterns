package 结构型模式._01_Proxy.JDK动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import 结构型模式._01_Proxy.SellTickers;

/**
 * @ClassName ProxyFactory
 * @Description 代理工厂类,用来生产代理对象
 * @Author StarLee
 * @Date 2021/11/10
 */

public class ProxyFactory {
    //声明目标对象
    private final TrainStation station = new TrainStation();

    //获取代理对象的方法
    public SellTickers getProxyObject() {
        //返回代理对象
        /*
            ClassLoader loader : 类加载器，用于加载代理类。可以通过目标对象获取类加载器
            Class<?>[] interfaces ： 被代理类实现的接口的字节码对象
            InvocationHandler h ： 代理对象的调用处理程序
        */
        return  (SellTickers) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /*
                        Object proxy : 代理对象。和proxyObject对象是同一个对象，在invoke方法中基本不用
                        Method method ： 对接口中的方法进行封装的method对象
                        Object[] args ： 调用方法的实际参数

                        返回值： 方法的返回值。
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //System.out.println("invoke方法执行了");
                        System.out.println("代售点收取一定的服务费用(jdk动态代理)");
                        //执行目标对象的方法
                        return method.invoke(station, args);
                    }
                }
                                                    );
    }
}
