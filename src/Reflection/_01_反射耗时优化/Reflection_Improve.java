package Reflection._01_反射耗时优化;

import Reflection._00_反射引出.Cat;
import Tools.CountTime;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName Reflection_Improve
 * @Description 反射时间效率是低下的,下面提供几种优化方式
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Reflection_Improve {

    public static void tradition(){
        CountTime.test("传统方式调用方法耗时", new CountTime.Task() {
            @Override
            public void execute() {
                Cat cat = new Cat();
                for (int i = 0; i < 90000000; i++) {
                    cat.cry();
                }
            }
        });
    }

    public static void reflection() throws Exception{
        CountTime.test("普通反射调用方法耗时", new CountTime.Task() {
            @Override
            public void execute() {
                Properties properties = new Properties();
                try {
                    properties.load(new FileInputStream("src/Reflection/Properties/example.properties"));
                    String classFullPath = properties.get("ClassFullPath").toString();
                    String methodName = properties.get("Method").toString();
                    Class<?> classObject = Class.forName(classFullPath);
                    Object o = classObject.newInstance();
                    Method methodObject = classObject.getMethod(methodName);
                    for (int i = 0; i < 90000000; i++) {
                        methodObject.invoke(o);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void reflection2() throws Exception{
        CountTime.test("反射优化调用方法耗时", new CountTime.Task() {
            @Override
            public void execute() {
                Properties properties = new Properties();
                try {
                    properties.load(new FileInputStream("src/Reflection/Properties/example.properties"));
                    String classFullPath = properties.get("ClassFullPath").toString();
                    String methodName = properties.get("Method").toString();
                    Class<?> classObject = Class.forName(classFullPath);
                    Object o = classObject.newInstance();
                    Method methodObject = classObject.getMethod(methodName);
                    methodObject.setAccessible(true);   //取消访问权限的检查

                    for (int i = 0; i < 90000000; i++) {
                        methodObject.invoke(o);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
