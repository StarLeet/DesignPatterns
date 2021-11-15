package 行为型模式._01_Template;

/**
 * @ClassName ConcreteClass_Fruit
 * @Description 炒蔬菜类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class ConcreteClass_Fruit extends AbstractClass{
    public void pourVegetable() {
        System.out.println("蔬菜下锅");
    }

    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
