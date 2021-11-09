package 设计原则._01_里氏代换原则.反里氏代换;

/**
 * @ClassName Square
 * @Description 在数学中,正方形就是一个特殊的矩形
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Square extends Rectangle{
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
