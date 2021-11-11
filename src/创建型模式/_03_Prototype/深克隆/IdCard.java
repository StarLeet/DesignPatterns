package 创建型模式._03_Prototype.深克隆;

import java.io.Serializable;

/**
 * @ClassName IdCard
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class IdCard implements Cloneable, Serializable {
    private Student stu; //String name 变成 Student stu

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    void show() {
        System.out.println(stu.getName() + "同学,Id号为" + stu.getId() + "的校园卡");
    }

    @Override
    public IdCard clone() throws CloneNotSupportedException {
        return (IdCard) super.clone();
    }
}
