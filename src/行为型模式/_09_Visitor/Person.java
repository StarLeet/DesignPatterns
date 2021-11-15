package 行为型模式._09_Visitor;

/**
 * @ClassName Person
 * @Description 抽象访问者角色类
 * @Author StarLee
 * @Date 2021/11/15
 */

public interface Person {
    //喂食宠物狗
    void feed(Cat cat);
    //喂食宠物猫
    void feed(Dog dog);
}
