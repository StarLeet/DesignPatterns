package 行为型模式._04_Responsibility.责任链群;

import 行为型模式._04_Responsibility.Handler;
import 行为型模式._04_Responsibility.LeaveRequest;

/**
 * @ClassName Manager
 * @Description 部门经理类（具体的处理者）
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Manager extends Handler {
    public Manager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println("部门经理审批：同意");
        System.out.println("流程结束！");
    }

    @Override
    public String getName() {
        return "Manager";
    }
}
