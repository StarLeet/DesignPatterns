package 结构型模式._07_Flyweight.享元类群;

/**
 * @ClassName IBox
 * @Description I图形类(具体享元角色)
 * @Author StarLee
 * @Date 2021/11/12
 */

public class IBox extends AbstractBox {
    public String getShape() {
        return "I";
    }
}
