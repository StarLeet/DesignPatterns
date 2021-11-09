package 设计原则._02_依赖倒转原则.依赖倒转优化;

/**
 * @ClassName AMDCpu
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class AMDCpu implements Cpu{
    @Override
    public void run() {
        System.out.println("AMDCpu正在运作");
    }
}
