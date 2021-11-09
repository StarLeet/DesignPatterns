package Reflection._04_反射创建实例;

/**
 * @ClassName User
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/9
 */

public class User {
    private int age = 10;
    private String name = "小明";
    public User() {//无参 public
    }
    public User(String name) {//public 的有参构造器
        this.name = name;
    }
    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
