package Reflection._02_Class对象获取;

/**
 * @ClassName Main
 * @Description 演示Class对象的6种获取方式
 * @Author StarLee
 * @Date 2021/11/9
 */

public class GetClass {
    public static void main(String[] args) throws Exception{
        //1.Class.forName
        String classFullPath = "Reflection.Class对象获取.Car"; //通过配置文件获取
        Class<?> cls1 = Class.forName(classFullPath);
        System.out.println(cls1);

        //2.类名.class  应用场景:用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3.对象.getClass()    应用场景:有对象实例
        Car reflect = new Car();
        Class cls3 = reflect.getClass();
        System.out.println(cls3);

        //4.通过类加载器来获取到类的Class对象
        //(1)先得到类加载器
        ClassLoader classLoader = reflect.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class<?> cls4 = classLoader.loadClass(classFullPath);
        System.out.println(cls4);

        //5.基本数据类型 Class cls = 基本数据类型.class(int.class)
        //6.基本数据类型对应包装类  Class cls = 包装类.TYPE(String.TYPE)

        /* 可用hashCode方法来证明上述方法得到的Class对象,都是同一个*/
    }
}
