package 设计原则._02_依赖倒转原则.依赖倒转优化;

/**
 * @ClassName IntelCpu
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class IntelCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
