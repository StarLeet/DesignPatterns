package 行为型模式._01_Template;

/**
 * @ClassName Main
 * @Description 演示模板模式
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Main {
    public static void main(String[] args) {
        //炒包菜
        //创建对象
        ConcreteClass_Fruit fruit = new ConcreteClass_Fruit();
        //调用炒菜的功能
        fruit.cookProcess();
    }
}
