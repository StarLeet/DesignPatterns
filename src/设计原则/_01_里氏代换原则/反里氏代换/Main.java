package 设计原则._01_里氏代换原则.反里氏代换;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {

    //扩宽方法
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

        Square square = new Square();
        square.setWidth(20);
//        resize(square);
        /*
          父类矩形在resize方法中可以正常拓宽
          子类正方形在resize方法中却陷入了死循环
          说明存在一个父类能运作的地方,子类无法运作
          即正方形不能是矩形,这是不合理的
          这就违背了里氏代换原则
         */
        System.out.println(square.toString());
    }
}
