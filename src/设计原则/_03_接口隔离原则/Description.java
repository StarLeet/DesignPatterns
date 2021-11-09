package 设计原则._03_接口隔离原则;

/**
 * @InterFaceName Description
 * @Description 接口隔离原则过于简单,只用片语解释
 * @Author StarLee
 * @Date 2021/11/8
 */
public interface Description {
    /*
    * 反接口隔离:
    * 假如有一个Duck类,Duck有fly方法、swim方法、eat方法
    * 突然我有一个玩具Duck类,我想让其继承Duck类,因为从某方面而言它也是一个鸭子(只不过是玩具)
    *
    * 但是问题来了,玩具鸭有飞的功能、也有游泳的功能,唯独不能吃东西
    * 如果我让其继承Duck类，势必继承父类的eat方法，这就违背了接口隔离原则
    *
    * 接口隔离原则(最小接口):子类应该只从父类继承自己所需的内容,反之父类的方法应该足够抽象,能够适用于所有子类
    * 解决方法:新建Animal接口,内置eat方法,让Duck类去实现它,玩具Duck直接继承Duck类而无需实现Animal接口
    * */
}
