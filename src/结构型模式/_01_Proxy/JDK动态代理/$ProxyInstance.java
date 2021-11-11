package 结构型模式._01_Proxy.JDK动态代理;


//  import com.itheima.proxy.dynamic.jdk.SellTickets;     //内存中的显示不出来,所以注释掉防报错
import 结构型模式._01_Proxy.SellTickers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @ClassName $ProxyInstance
 * @Description 反编译出的,内存中存在的代理对象所属类
 *              JDK动态代理是对接口进行代理,如果说类没有一个实现的接口,就不能进行JDK代理
 * @Author StarLee
 * @Date 2021/11/10
 */

/*    给main函数末尾追加while(true),在Main程序运行时,使用阿里开源软件 阿尔萨斯(Arthas)
 *          从内存中反编译出com.sun.proxy.$Proxy0
 */             // 防冲突写成$ProxyInstance
public final class $ProxyInstance extends Proxy implements SellTickers {
//    private static Method m1;
//    private static Method m2;
    private static Method m3;
//    private static Method m0;

    public $ProxyInstance(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    static {
        try {
//            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
//            m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            m3 = Class.forName("com.itheima.proxy.dynamic.jdk.SellTickets").getMethod("sell", new Class[0]);
//            m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
//            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new NoSuchMethodError(noSuchMethodException.getMessage());
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError(classNotFoundException.getMessage());
        }
    }

//    public final boolean equals(Object object) {
//        try {
//            return (Boolean)this.h.invoke(this, m1, new Object[]{object});
//        }
//        catch (Error | RuntimeException throwable) {
//            throw throwable;
//        }
//        catch (Throwable throwable) {
//            throw new UndeclaredThrowableException(throwable);
//        }
//    }

//    public final String toString() {
//        try {
//            return (String)this.h.invoke(this, m2, null);
//        }
//        catch (Error | RuntimeException throwable) {
//            throw throwable;
//        }
//        catch (Throwable throwable) {
//            throw new UndeclaredThrowableException(throwable);
//        }
//    }
//
//    public final int hashCode() {
//        try {
//            return (Integer)this.h.invoke(this, m0, null);
//        }
//        catch (Error | RuntimeException throwable) {
//            throw throwable;
//        }
//        catch (Throwable throwable) {
//            throw new UndeclaredThrowableException(throwable);
//        }
//    }

    public final void sell() {
        try {
            this.h.invoke(this, m3, null);
            return;
        }
        catch (Error | RuntimeException throwable) {
            throw throwable;
        }
        catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }
}
