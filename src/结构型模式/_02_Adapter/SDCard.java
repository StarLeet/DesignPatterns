package 结构型模式._02_Adapter;

/**
 * @ClassName SDCard
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/12
 */

public class SDCard implements SDStandard {
    public String readSD() {
        String msg = "SDCard read msg ： hello word SD";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("SDCard write msg ：" + msg);
    }
}
