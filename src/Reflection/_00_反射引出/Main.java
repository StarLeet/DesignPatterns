package Reflection._00_反射引出;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName Main
 * @Description 配置文件引出反射
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Main {
    public static void main(String[] args) throws Exception{
        /*   传统调用对象方法的步骤    */
        Cat cat = new Cat();
        cat.cry();
        System.out.println("=============");
        /*   传统缺点:一旦想要从cry方法更换成run方法,就需要在源码中大量的修改cat.cry()  */

        /*有没有一种方式,可以只修改一处地方,编译器就会自动帮你更换所有的修改处?(类似于一键全部替换)
        *
        * 有！答案就是反射机制 + 配置文件
        */
        Properties properties = new Properties();
        /*  通过流的形式读取指定的配置文件     */
        properties.load(new FileInputStream("src/Reflection/Properties/example.properties"));

        String classFullPath = properties.get("ClassFullPath").toString();
        String method = properties.get("Method").toString();
        /*  查看配置文件是否读取成功    */
        System.out.println("ClassFullPath " + classFullPath);
        System.out.println("Method " + method);

        /*  获取配置文件信息后,反射步骤如下    */
        // 1. 通过包名.类名获取目标的Class对象
        Class<?> classObject = Class.forName(classFullPath);
        // 2. 通过无参构造创建对象
        Object o = classObject.newInstance();
        System.out.println("o的运行类型为 " + o.getClass());
        // 3. 通过Class对象获取方法对象
        Method methodObject = classObject.getMethod(method);   //只能获取公有方法
        // 4. 方法对象.invoke(Cat对象)
        methodObject.invoke(o);

        /*  如果想获取类的成员变量 + 构造器 可以如下  */
        //java.lang.reflect.Field: 代表类的成员变量, Field 对象表示某个类的成员变量
        Field ageObject = classObject.getField("age");  //只能获取公有成员
        System.out.println("age " + ageObject.get(o));

        //java.lang.reflect.Constructor: 代表类的构造方法, Constructor 对象表示构造器
        Constructor<?> consObject = classObject.getConstructor();
        System.out.println(consObject);

        //获取有参构造器
        Constructor<?> consObject1 = classObject.getConstructor(int.class,String.class);
        System.out.println(consObject1);


    }
}
