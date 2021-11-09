package 设计原则._02_依赖倒转原则.依赖倒转优化;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu(new IntelCpu());
        computer.setHardDisk(new SamSungDisk());
        computer.setMemory(new SamSungMemory());
        computer.run();
        System.out.println("===============");
        Computer computer1 = new Computer();
        computer1.setCpu(new AMDCpu());
        computer1.setHardDisk(new HolaDisk());
        computer1.setMemory(new SamSungMemory());
        computer1.run();
    }
}
