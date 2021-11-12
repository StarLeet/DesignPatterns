package 结构型模式._02_Adapter.类适配器;

import 结构型模式._02_Adapter.Computer;
import 结构型模式._02_Adapter.SDCard;

/**
 * @ClassName Main
 * @Description 演示类适配器模式
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Main {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCard());
        System.out.println(msg);

        System.out.println("===============");
        //使用该电脑读取TF卡中的数据
        //定义适配器类
        String msg1 = computer.readSD(new Adapter());
        System.out.println(msg1);
    }
}
