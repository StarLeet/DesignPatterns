package 行为型模式._08_Iterator;

/**
 * @ClassName StudentAggregate
 * @Description 抽象聚合角色接口
 * @Author StarLee
 * @Date 2021/11/15
 */

public interface StudentAggregate {
    //添加学生功能
    void addStudent(Student stu);

    //删除学生功能
    void removeStudent(Student stu);

    //获取迭代器对象功能
    StudentIterator getStudentIterator();
}
