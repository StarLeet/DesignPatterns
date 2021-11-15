package 行为型模式._04_Responsibility.责任链群;

import 行为型模式._04_Responsibility.Handler;
import 行为型模式._04_Responsibility.LeaveRequest;

/**
 * @ClassName GeneralManager
 * @Description 总经理类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class GeneralManager extends Handler {
    public GeneralManager() {
        super(Handler.NUM_THREE,Handler.NUM_SEVEN);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println("总经理审批：同意");
        System.out.println("流程结束！");
    }

    @Override
    public String getName() {
        return "GeneralManager";
    }
}
