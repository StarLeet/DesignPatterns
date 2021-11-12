package 结构型模式._04_Bridge;

import 结构型模式._04_Bridge.实现化类群.VideoFile;

/**
 * @ClassName Windows
 * @Description Windows操作系统
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Windows extends OperatingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
