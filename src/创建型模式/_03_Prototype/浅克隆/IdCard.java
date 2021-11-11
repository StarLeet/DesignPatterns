package 创建型模式._03_Prototype.浅克隆;

/**
 * @ClassName IdCard
 * @Description 学生卡
 * @Author StarLee
 * @Date 2021/11/10
 */

public class IdCard implements Cloneable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name + "同学的校园卡");
    }

    @Override
    public IdCard clone() throws CloneNotSupportedException {
        return (IdCard) super.clone();
    }
}
