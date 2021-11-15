package 行为型模式._03_Command;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Order
 * @Description 订单类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Order {
    //餐桌号码
    private int diningTable;

    //所下的餐品及份数
    private Map<String,Integer> foodDir = new HashMap<String, Integer>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name,int num) {
        foodDir.put(name,num);
    }
}
