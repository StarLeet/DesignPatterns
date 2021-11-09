package 设计原则._01_里氏代换原则.反里氏代换;

/**
 * @ClassName Rectangle
 * @Description 定义一个矩形类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
