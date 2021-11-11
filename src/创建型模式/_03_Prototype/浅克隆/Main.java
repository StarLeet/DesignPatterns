package 创建型模式._03_Prototype.浅克隆;

/**
 * @ClassName Main
 * @Description 演示原型模式的浅克隆
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    /*
    *  浅克隆: 对于非基本(引用)类型属性，仍指向原有属性所指向的对象的内存地址
    *  String比较特殊,比如下面校园卡案例,改变了name,String才会开辟出新的空间并指向新空间,间接达到了深克隆的效果
    * */
    public static void main(String[] args) throws CloneNotSupportedException {
        IdCard c1 = new IdCard();
        c1.setName("张三");

        //复制奖状
        IdCard c2 = c1.clone();
        System.out.println("=================");
        System.out.println(c1.getName() + c1.getName().hashCode());
        System.out.println(c2.getName() + c2.getName().hashCode()); //可见二者的哈希值是一样的
        System.out.println("=================");
        //将奖状的名字修改李四
        c2.setName("李四");
        System.out.println(c1.getName() + c1.getName().hashCode());
        System.out.println(c2.getName() + c2.getName().hashCode()); //哈希值有了变化,String达到深拷贝
        System.out.println("=================");
        c1.show();
        c2.show();
    }
}
