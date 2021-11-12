package 结构型模式._04_Bridge;

import 结构型模式._04_Bridge.实现化类群.AviFile;

/**
 * @ClassName Main
 * @Description 桥接模式的演示
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Main {
    public static void main(String[] args) {
        //创建mac系统对象
        OperatingSystem system = new Mac(new AviFile());
        //使用操作系统播放视频文件
        system.play("战狼3");
    }
}
