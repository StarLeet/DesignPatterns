package 行为型模式._07_Mediator;

/**
 * @ClassName Person
 * @Description 抽象同事类
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
