package 行为型模式._07_Mediator;

/**
 * @ClassName HouseOwner
 * @Description 具体的同事角色类
 * @Author StarLee
 * @Date 2021/11/15
 */

public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //和中介联系（沟通）
    public void constact(String message) {
        mediator.constact(message,this);
    }

    //获取信息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是：" + message);
    }
}
