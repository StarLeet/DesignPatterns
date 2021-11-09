package 设计原则._02_依赖倒转原则.依赖倒转优化;

/**
 * @ClassName SamSungDisk
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class SamSungDisk implements Disk{
    @Override
    public void save(String data) {
        System.out.println("使用三星固态存储数据为：" + data);
    }

    @Override
    public String get() {
        System.out.println("使用三星硬盘取数据");
        return "数据";
    }
}
