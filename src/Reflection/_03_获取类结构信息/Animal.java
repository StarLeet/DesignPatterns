package Reflection._03_获取类结构信息;

/**
 * @ClassName Animal
 * @Description Person父类
 * @Author StarLee
 * @Date 2021/11/9
 */

public class Animal {
    public String sex;
    private boolean live;

    public Animal(){}

    private Animal(String sex) { this.sex = sex; }

    public void eat(){};
    protected void sleep(){};
    private void run(){};
}
