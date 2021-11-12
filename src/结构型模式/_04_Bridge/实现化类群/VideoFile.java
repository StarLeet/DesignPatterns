package 结构型模式._04_Bridge.实现化类群;

/**
 * @ClassName VideoFile
 * @Description 视频文件(抽象实现)
 * @Author StarLee
 * @Date 2021/11/12
 */

public interface VideoFile {
    //解码功能
    void decode(String fileName);
}
