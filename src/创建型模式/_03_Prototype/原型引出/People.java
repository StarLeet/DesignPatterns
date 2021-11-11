package 创建型模式._03_Prototype.原型引出;

/**
 * @ClassName People
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class People implements Cloneable{
    public People() {
        System.out.println("人类创建创建完成！");
    }

    @Override
    public People clone() throws CloneNotSupportedException {
        System.out.println("克隆人复制成功！");

        return (People) super.clone();
    }
}
