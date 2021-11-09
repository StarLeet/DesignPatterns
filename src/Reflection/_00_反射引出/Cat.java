package Reflection._00_反射引出;

/**
 * @ClassName Cat
 * @Description 测试用例,猫类
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Cat {
    public int age = 5;
    private String name = "小花";

    public Cat(){}

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void cry(){
        //System.out.println("小猫哭唧唧~");
    }

    public void run(){
        System.out.println("小猫撒腿乱跑");
    }
}
