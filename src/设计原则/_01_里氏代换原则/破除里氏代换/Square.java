package 设计原则._01_里氏代换原则.破除里氏代换;

/**
 * @ClassName Square
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Square implements Quadrilateral{

    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return getLength();
    }
}
