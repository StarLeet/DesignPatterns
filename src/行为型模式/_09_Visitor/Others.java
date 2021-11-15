package 行为型模式._09_Visitor;

/**
 * @ClassName Others
 * @Description 其他人
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Others implements Person{
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
}
