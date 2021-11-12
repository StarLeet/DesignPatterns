package 结构型模式._02_Adapter.对象适配器;

import 结构型模式._02_Adapter.Computer;
import 结构型模式._02_Adapter.SDCard;
import 结构型模式._02_Adapter.TFCard;

/**
 * @ClassName Main
 * @Description 演示对象适配者模式
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
        //创建适配器类对象
        Adapter sdAdapterTF = new Adapter(new TFCard());
        String msg1 = computer.readSD(sdAdapterTF);
        System.out.println(msg1);
    }
}
