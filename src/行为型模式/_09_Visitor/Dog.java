package 行为型模式._09_Visitor;

/**
 * @ClassName Dog
 * @Description 具体元素角色类（宠物狗）
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Dog implements Animal{
    public void accept(Person person) {
        person.feed(this); //访问者给宠物猫喂食
        System.out.println("好好吃，汪汪汪。。。");
    }
}
