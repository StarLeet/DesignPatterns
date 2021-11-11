package 创建型模式._01_Singleton.DoubleLock;

/**
 * @ClassName Main
 * @Description 多线程双重锁演示
 * @Author StarLee
 * @Date 2021/11/10
 */
public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);  // 静态代理
        thread1.start();
        thread1.setName("线程0");

        Thread thread2 = new Thread(myThread);
        thread2.start();
        thread2.setName("线程1");

        Thread thread3 = new Thread(myThread);
        thread3.start();
        thread3.setName("线程2");

    }
}
