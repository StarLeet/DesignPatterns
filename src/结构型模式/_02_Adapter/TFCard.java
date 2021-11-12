package 结构型模式._02_Adapter;

/**
 * @ClassName TFCard
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/12
 */

public class TFCard implements TFStandard {
    public String readTF() {
        String msg = "TFCard read msg ： hello word TFcard";
        return msg;
    }

    public void writeTF(String msg) {
        System.out.println("TFCard write msg :" + msg);
    }
}
