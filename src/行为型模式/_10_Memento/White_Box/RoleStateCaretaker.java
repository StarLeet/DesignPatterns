package 行为型模式._10_Memento.White_Box;

/**
 * @ClassName RoleStateCaretaker
 * @Description 备忘录对象管理对象
 * @Author StarLee
 * @Date 2021/11/15
 */

public class RoleStateCaretaker {
    //声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
