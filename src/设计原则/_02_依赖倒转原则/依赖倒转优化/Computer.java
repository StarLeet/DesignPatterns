package 设计原则._02_依赖倒转原则.依赖倒转优化;

/**
 * @ClassName Computer
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Computer {
    private Disk disk;   //硬盘可以是任意牌子的
    private Cpu cpu;           //Cpu也是
    private Memory memory;   // 内存条也是
    /*
     * 这样做就将一个电脑变成了可以自由DIY的
     * 满足了依赖倒转原则
     * */
    public Disk getHardDisk() {
        return disk;
    }

    public void setHardDisk(Disk hardDisk) {
        this.disk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = disk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}
