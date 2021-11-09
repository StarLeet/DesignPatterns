package 设计原则._02_依赖倒转原则.依赖倒转优化;

/**
 * @ClassName SamSungMemory
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class SamSungMemory implements Memory{
    @Override
    public void save() {
        System.out.println("使用三星内存条");
    }
}
