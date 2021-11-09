package 创建型模式.Singleton.DoubleLock;

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
