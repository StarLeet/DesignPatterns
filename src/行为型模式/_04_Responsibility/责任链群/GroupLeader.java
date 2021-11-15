package 行为型模式._04_Responsibility.责任链群;

import 行为型模式._04_Responsibility.Handler;
import 行为型模式._04_Responsibility.LeaveRequest;

/**
 * @ClassName GroupLeader
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/14
 */

public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println("小组长审批：同意");
        System.out.println("流程结束！");
    }

    @Override
    public String getName() {
        return "GroupLeader";
    }
}
