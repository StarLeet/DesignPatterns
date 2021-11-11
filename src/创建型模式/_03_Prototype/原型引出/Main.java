package 创建型模式._03_Prototype.原型引出;

/**
 * @ClassName Main
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    public static void main(String[] args) throws Exception{
        People people = new People();
        People people1 = people.clone();
        System.out.println("People类的构造器只被调用了一次,说明新对象不是通过new出来的");

        System.out.println("====================");
        System.out.println("人对象的HashCode  " + people.hashCode());
        System.out.println("克隆人对象的HashCode  " + people1.hashCode());
    }
}
