package 行为型模式._06_Observer;

/**
 * @ClassName WeChatUser
 * @Description 具体的观察者角色类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class WeChatUser implements Observer{
    private String name;

    public WeChatUser(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
