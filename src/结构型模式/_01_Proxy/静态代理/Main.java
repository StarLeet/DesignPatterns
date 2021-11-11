package 结构型模式._01_Proxy.静态代理;

/**
 * @ClassName Main
 * @Description 演示静态代理模式
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    /*
    *  JDK动态代理生成的代理对象，是由JVM生成的，而不是用户操作的
    * */
    public static void main(String[] args) {
        ProxyPoint.sell();
    }
}
