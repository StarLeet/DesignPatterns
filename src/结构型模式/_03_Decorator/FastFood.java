package 结构型模式._03_Decorator;

/**
 * @ClassName FastFood
 * @Description 抽象构件类
 * @Author StarLee
 * @Date 2021/11/12
 */

public abstract class FastFood {
    private float price;//价格
    private String desc; //描述

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood() {
    }

    public abstract float cost();
}
