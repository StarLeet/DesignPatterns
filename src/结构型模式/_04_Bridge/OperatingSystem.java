package 结构型模式._04_Bridge;

import 结构型模式._04_Bridge.实现化类群.VideoFile;

/**
 * @ClassName OperatingSystem
 * @Description 抽象操作系统类
 * @Author StarLee
 * @Date 2021/11/12
 */

public abstract class OperatingSystem {
    //声明videFile变量
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
