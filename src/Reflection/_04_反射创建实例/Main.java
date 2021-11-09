package Reflection._04_反射创建实例;

import java.lang.reflect.Constructor;

/**
 * @ClassName Main
 * @Description 演示反射创建实例的三种方式
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Main {
    public static void main(String[] args) throws Exception{
        //1. 先获取到 User 类的 Class 对象
        Class<?> userClass = Class.forName("Reflection._04_反射创建实例.User");
        //2. 通过 public 的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);
        //3. 通过 public 的有参构造器创建实例
        /*
        constructor 对象就是
        public User(String name) {//public 的有参构造器
        this.name = name;
        }
        */
        //3.1 先得到对应构造器
        Constructor<?> constructor = userClass.getConstructor(String.class);
        //3.2 创建实例，并传入实参
        Object o1 = constructor.newInstance("小猪比");
        System.out.println("User=" + o1);
        //4. 通过非 public 的有参构造器创建实例
        //4.1 得到 private 的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //4.2 创建实例
        //暴破【暴力破解】 , 使用反射可以访问 private 构造器/方法/属性, 反射面前，都是纸老虎
        constructor1.setAccessible(true);
        Object o2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2=" + o2);

    }
}
