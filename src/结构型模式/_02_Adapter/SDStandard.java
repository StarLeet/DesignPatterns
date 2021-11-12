package 结构型模式._02_Adapter;

/**
 * @InterFaceName SDStandard
 * @Description SD卡实现标准
 * @Author StarLee
 * @Date 2021/11/12
 */
public interface SDStandard {
    //从SD卡中读取数据
    String readSD();
    //往SD卡中写数据
    void writeSD(String msg);
}
