package Reflection._03_获取类结构信息;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName Main
 * @Description 演示反射获取类结构信息(构造器、属性、方法等)的各种API
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Main {
    public static void main(String[] args) throws Exception{
        //得到 Class 对象
        Class<?> personCls = Class.forName("Reflection._03_获取类结构信息.Person");
        System.out.println("===================");

        Main.api02(personCls);
    }

    public static void api01(Class<?> personCls) throws Exception{
        // 1. getName:获取全类名
        System.out.println(personCls.getName());//Reflection.获取类结构信息.Person
        System.out.println("==================");

        // 2. getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());//Person
        System.out.println("==================");

        // 3. getFields:获取所有 public 修饰的属性，包含本类以及所有父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {//增强 for
            System.out.println("本类以及父类的public属性=" + field.getName());
        }
        System.out.println("==================");

        // 4. getDeclaredFields:获取本类中所有属性(包括私有)
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName());
        }
        System.out.println("==================");

        // 5. getMethods:获取所有 public 修饰的方法，包含本类以及所有父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类以及父类的public方法=" + method.getName());
        }
        System.out.println("==================");

        // 6. getDeclaredMethods:获取本类中所有方法(包括私有)
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName());
        }
        System.out.println("==================");

        // 7. getConstructors: 获取所有 public 修饰的构造器，仅包含本类
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的public构造器=" + constructor.getName());
        }
        System.out.println("==================");

        // 8. getDeclaredConstructors:获取本类中所有构造器(包括私有)
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有构造器=" + declaredConstructor.getName());//这里老师只是输出名
        }
        System.out.println("==================");

        // 9. getPackage:以 Package 形式返回 包信息
        System.out.println(personCls.getPackage());//com.hspedu.reflection
        System.out.println("==================");

        // 10. getSuperClass:以 Class 形式返回直接父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类的 class 对象=" + superclass);
        System.out.println("==================");

        // 11. getInterfaces:以 Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息=" + anInterface);
        }
        System.out.println("==================");

        // 12. getAnnotations:以 Annotation[] 形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息=" + annotation);//注解
        }
        System.out.println("==================");


    }

    public static void api02(Class<?> personCls) throws Exception{
        /*
        * 默认修饰符 是 0 ， public 是 1 ，private 是 2
        * protected 是 4 , static 是 8 ，final 是 16
        */
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性=" + declaredField.getName()
                    + " 该属性的修饰符值=" + declaredField.getModifiers()
                    + " 该属性的类型=" + declaredField.getType()
            );

        }
        System.out.println("====================");

        //getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法=" + declaredMethod.getName()
                    + " 该方法的访问修饰符值=" + declaredMethod.getModifiers()
                    + " 该方法返回类型" + declaredMethod.getReturnType()
            );
            //输出当前这个方法的形参数组情况
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("该方法的形参类型=" + parameterType);
            }
        }
        System.out.println("====================");

        //getDeclaredConstructors:获取本类中所有构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.print("本类中所有构造器=" + declaredConstructor.getName() + "  ");//这里老师只是输出名
            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes){
                System.out.println("该构造器的形参类型=" + parameterType);
            }
        }
    }
}
