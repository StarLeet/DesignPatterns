package 行为型模式._01_Template;

/**
 * @ClassName ConcreteClass_Meat
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/14
 */

public class ConcreteClass_Meat extends AbstractClass{
    public void pourVegetable() {
        System.out.println("下锅肉类");
    }

    public void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}
