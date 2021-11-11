package 创建型模式._02_Factory._03_配置工厂模式;

import 创建型模式._02_Factory.Factory;
import 创建型模式._02_Factory.咖啡类群.Coffee;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName CoffeeFactory
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/8
 */

public class CoffeeFactory implements Factory {
    //加载配置文件，获取配置文件中配置的全类名，并创建该类的对象进行存储
    //1,定义容器对象存储咖啡对象
    private static final HashMap<String,Coffee> map = new HashMap<>();

    //2,加载配置文件， 只需要加载一次
    static {
        //2.1 创建Properties对象
        Properties p = new Properties();
        //2.2 调用p对象中的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("创建型模式/_02_Factory/_03_配置工厂模式/Factory.Properties");
        try {
            p.load(is);
            //从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                String className = p.getProperty((String) key);
                //通过反射技术创建对象
                Class clazz = Class.forName(className);
                Constructor constructor = clazz.getConstructor(String.class);

                Coffee coffee = (Coffee) constructor.newInstance(key);
                //将名称和对象存储到容器中
                map.put((String)key,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //根据名称获取对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
