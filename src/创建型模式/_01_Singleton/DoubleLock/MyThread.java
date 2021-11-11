package 创建型模式._01_Singleton.DoubleLock;

/**
 * @ClassName MyThread
 * @Description 线程类
 * @Author StarLee
 * @Date 2021/11/10
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        while (true){
            Singleton.getInstance();   //模拟多线程访问单例模式
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
