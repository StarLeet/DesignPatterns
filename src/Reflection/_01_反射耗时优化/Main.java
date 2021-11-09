package Reflection._01_反射耗时优化;

/**
 * @ClassName Main
 * @Description 比较反射与正常创建对象的时间差异
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Main {
    public static void main(String[] args) throws Exception{
        Reflection_Improve.tradition();
        Reflection_Improve.reflection();
        Reflection_Improve.reflection2();
    }
}
