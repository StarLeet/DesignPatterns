package 结构型模式._07_Flyweight.享元类群;

/**
 * @ClassName AbstractBox
 * @Description 抽象享元角色
 * @Author StarLee
 * @Date 2021/11/12
 */

public abstract class AbstractBox {
    //获取图形的方法
    public abstract String getShape();

    //显示图形及颜色
    public void display(String color) {
        System.out.println("方块形状：" + getShape() + ", 颜色：" + color);
    }
}
