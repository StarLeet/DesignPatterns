package 行为型模式._09_Visitor;

/**
 * @ClassName Animal
 * @Description 抽象元素角色类
 * @Author StarLee
 * @Date 2021/11/15
 */

public interface Animal {
    //接受访问者访问的功能
    void accept(Person person);
}
