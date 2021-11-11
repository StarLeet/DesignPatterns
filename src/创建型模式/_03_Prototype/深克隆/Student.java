package 创建型模式._03_Prototype.深克隆;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Student implements Serializable {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
