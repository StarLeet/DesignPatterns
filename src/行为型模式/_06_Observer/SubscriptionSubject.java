package 行为型模式._06_Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName SubscriptionSubject
 * @Description 具体主题角色类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class SubscriptionSubject implements Subject{
    //定义一个集合，用来存储多个观察者对象
    private List<Observer> weChatUserList = new ArrayList<Observer>();

    public void attach(Observer observer) {
        weChatUserList.add(observer);
    }

    public void detach(Observer observer) {
        weChatUserList.remove(observer);
    }

    public void notify(String message) {
        //遍历集合
        for (Observer observer : weChatUserList) {
            //调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
