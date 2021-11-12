package 结构型模式._02_Adapter.类适配器;

import 结构型模式._02_Adapter.SDStandard;
import 结构型模式._02_Adapter.TFCard;

/**
 * @ClassName Adapter
 * @Description SD卡适配TF卡的适配器
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Adapter extends TFCard implements SDStandard {
    public String readSD() {
        System.out.println("适配器读取TF卡");
        return readTF();
    }

    public void writeSD(String msg) {
        System.out.println("适配器写入TF卡");
        writeTF(msg);
    }
}
