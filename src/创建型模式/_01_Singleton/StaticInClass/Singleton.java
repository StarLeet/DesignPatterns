package 创建型模式._01_Singleton.StaticInClass;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static class InnerClass{
        private static final Singleton EARTH = new Singleton();
    }

    private Singleton() { }

    public static Singleton getInstance(){
        return InnerClass.EARTH;
    }

    /**
     ！！！关键 readResolve()方法
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return InnerClass.EARTH;
    }

}
