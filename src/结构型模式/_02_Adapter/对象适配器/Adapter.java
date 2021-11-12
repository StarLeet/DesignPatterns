package 结构型模式._02_Adapter.对象适配器;

import 结构型模式._02_Adapter.SDStandard;
import 结构型模式._02_Adapter.TFCard;
import 结构型模式._02_Adapter.TFStandard;

/**
 * @ClassName Adapter
 * @Description 适配器类
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Adapter implements SDStandard {
    //声明适配者类
    private TFStandard tfStandard;

    public Adapter(TFStandard tfStandard) {
        this.tfStandard = tfStandard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfStandard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfStandard.writeTF(msg);
    }
}
