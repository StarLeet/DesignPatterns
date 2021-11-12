package 结构型模式._02_Adapter;

import 结构型模式._02_Adapter.SDStandard;

/**
 * @ClassName Computer
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/12
 */

public class Computer {
    //从SD卡中读取数据
    public String readSD(SDStandard sdStandard) {
        if(sdStandard == null) {
            throw  new NullPointerException("sd card is not null");
        }
        return sdStandard.readSD();
    }
}
