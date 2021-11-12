package 结构型模式._02_Adapter;

/**
 * @ClassName TFStandard
 * @Description TF卡实现标准
 * @Author StarLee
 * @Date 2021/11/12
 */

public interface TFStandard {
    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
