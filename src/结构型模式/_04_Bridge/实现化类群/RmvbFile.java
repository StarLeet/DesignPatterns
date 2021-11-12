package 结构型模式._04_Bridge.实现化类群;

/**
 * @ClassName RmvbFile
 * @Description rmvb视频文件(具体实现化)
 * @Author StarLee
 * @Date 2021/11/12
 */

public class RmvbFile implements VideoFile {
    public void decode(String fileName) {
        System.out.println("rmvb视频文件 ：" + fileName);
    }
}
