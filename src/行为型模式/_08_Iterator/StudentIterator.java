package 行为型模式._08_Iterator;

/**
 * @ClassName StudentIterator
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/15
 */

public interface StudentIterator {
    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素
    Student next();
}
