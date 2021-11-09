package 设计原则._02_依赖倒转原则.反依赖倒转;

import 设计原则._02_依赖倒转原则.依赖倒转优化.AMDCpu;

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
    }
}
