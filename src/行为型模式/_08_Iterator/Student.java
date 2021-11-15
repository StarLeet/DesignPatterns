package 行为型模式._08_Iterator;

/**
 * @ClassName Student
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Student {
    private String name;
    private String number;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Student() {
    }
}
