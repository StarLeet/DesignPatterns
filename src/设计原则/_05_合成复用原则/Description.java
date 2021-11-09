package 设计原则._05_合成复用原则;

/**
 * @InterFaceName Description
 * @Description 合成复用原则描述
 * @Author StarLee
 * @Date 2021/11/8
 */
public interface Description {
    /*
    *  合成复用原则: 尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现
    *
    *  继承缺点:
    *   1. 破坏类的封装性;继承会导致父类的细节暴露给子类
    *   2. 子类与父类耦合性过高,修改父类会直接影响子类
    *   3. 从父类继承来的方法是静态加载的,在编译就定义;复用来的可以是动态的
    * */
}
