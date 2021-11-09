package 设计原则._01_里氏代换原则.破除里氏代换;

/**
 * @ClassName Rectangle
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Rectangle implements Quadrilateral{
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
