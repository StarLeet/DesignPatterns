package 设计原则._01_里氏代换原则.破除里氏代换;

/**
 * @InterFaceName Quadrilateral
 * @Description 为四边形定义规范
 * @Author StarLee
 * @Date 2021/11/8
 */
public interface Quadrilateral {  //定义一个接口,将正方形与矩形解耦
    double getLength();
    double getWidth();
}
