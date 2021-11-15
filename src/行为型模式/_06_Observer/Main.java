package 行为型模式._06_Observer;

/**
 * @ClassName Main
 * @Description 演示观察者模式
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Main {
    public static void main(String[] args) {
        //1,创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();

        //2,订阅公众号
        subject.attach(new WeChatUser("孙悟空"));
        subject.attach(new WeChatUser("猪悟能"));
        subject.attach(new WeChatUser("沙悟净"));

        //3,公众号更新，发出消息给订阅者（观察者对象）
        subject.notify("XXX专栏更新了！");
    }
}
