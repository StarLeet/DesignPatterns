package Reflection._03_获取类结构信息;

/**
 * @ClassName Person
 * @Description API测试类
 * @Author StarLee
 * @Date 2021/11/9
 */
@Deprecated
public class Person extends Animal implements IA{
    private String name;
    protected int age;
    double height;
    public double weight;

    public Person(){}

    public Person(String name) { this.name = name; }

    private Person(int age){ this.age = age; }

    private void f1(){}
    protected void f2(){}
    void f3(){}
    public void f4(){}
}
