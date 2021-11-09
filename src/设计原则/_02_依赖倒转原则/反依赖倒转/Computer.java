package 设计原则._02_依赖倒转原则.反依赖倒转;

/**
 * @ClassName Computer
 * @Description 计算机类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Computer {
    private SamSungDisk hardDisk;   //硬盘固定为三星的
    private IntelCpu cpu;           //Cpu只能是Intel的
    private SamSungMemory memory;   // 内存条只能是三星的
    /*
    * 这样做有一个坏处,以后我想换其他牌子的CPU，Disk我就必须修改源码
    * 这就违反了开闭原则
    * 唯一的方法就是采用依赖倒转原则:聚合目标的抽象而不是目标本身
    * */
    public SamSungDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(SamSungDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public SamSungMemory getMemory() {
        return memory;
    }

    public void setMemory(SamSungMemory memory) {
        this.memory = memory;
    }

    public void run() {
        System.out.println("运行计算机");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取的数据是：" + data);
        cpu.run();
        memory.save();
    }
}
