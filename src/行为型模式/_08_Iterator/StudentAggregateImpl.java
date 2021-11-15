package 行为型模式._08_Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StudentAggregateImpl
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/15
 */

public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<Student>();

    public void addStudent(Student stu) {
        list.add(stu);
    }

    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    //获取迭代器对象
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
