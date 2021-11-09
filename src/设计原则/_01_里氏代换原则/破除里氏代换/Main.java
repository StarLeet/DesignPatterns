package 设计原则._01_里氏代换原则.破除里氏代换;


/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，进行扩宽的操作
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        System.out.println(rectangle.toString());
        System.out.println("================");
    }
}
