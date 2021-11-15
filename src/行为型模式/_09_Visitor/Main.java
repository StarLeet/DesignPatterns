package 行为型模式._09_Visitor;

/**
 * @ClassName Main
 * @Description 演示访问者模式
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Main {
    public static void main(String[] args) {
        //创建Home对象
        Home home = new Home();
        //添加元素到Home对象中
        home.add(new Dog());
        home.add(new Cat());

        //创建主人对象
        Owner owner = new Owner();
        //让主人喂食所有的宠物
        home.action(owner);
    }
}
