package Singleton.DoubleLock;

public class Singleton {
    private static volatile Singleton EARTH;  //假设单例实例化的对象是地球,因为地球只有一个
    //volatile关键字防止某些情况下的空指针异常
    private static boolean flag;
    private Singleton() {
        synchronized (Singleton.class) { //避免反射破坏单例模式
            if (flag) throw new RuntimeException("谁tm让你用的反射");
            System.out.println("地球已经被创建");
            flag = true;
        }
    }

    public static Singleton getInstance(){
        if (EARTH == null){    //双检查锁
            synchronized (Singleton.class){  //将同步代码块放在这里效率更高,因为只有EARTH为null时才需要同步
                if (EARTH == null){
                    EARTH = new Singleton();
                }
            }
            System.out.println("出现线程安全问题,但被同步锁及时阻止");
        }
        System.out.println(Thread.currentThread().getName() +  "正在访问,但危险期已过~");
        return EARTH;
    }
}
