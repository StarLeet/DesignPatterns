package 结构型模式._04_Bridge.实现化类群;

/**
 * @ClassName AviFile
 * @Description avi视频文件(具体的实现化)
 * @Author StarLee
 * @Date 2021/11/12
 */

public class AviFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("avi视频文件 ：" + fileName);
    }
}
