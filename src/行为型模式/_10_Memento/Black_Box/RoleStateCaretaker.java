package 行为型模式._10_Memento.Black_Box;

/**
 * @ClassName RoleStateCaretaker
 * @Description 备忘录对象管理对象
 * @Author StarLee
 * @Date 2021/11/15
 */

public class RoleStateCaretaker {
    //声明RoleStateMemento类型的变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
