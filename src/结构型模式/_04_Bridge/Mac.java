package 结构型模式._04_Bridge;

import 结构型模式._04_Bridge.实现化类群.VideoFile;

/**
 * @ClassName Mac
 * @Description Mac操作系统(扩展抽象化)
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Mac extends OperatingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
