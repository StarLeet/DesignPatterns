package 设计原则._02_依赖倒转原则.反依赖倒转;

/**
 * @ClassName SangSungDisk
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class SamSungDisk {
    //存储数据的方法
    public void save(String data) {
        System.out.println("使用三星固态存储数据为：" + data);
    }

    //获取数据的方法
    public String get() {
        System.out.println("使用三星硬盘取数据");
        return "数据";
    }
}
