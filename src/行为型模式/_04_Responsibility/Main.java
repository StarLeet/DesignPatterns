package 行为型模式._04_Responsibility;

import 行为型模式._04_Responsibility.责任链群.GeneralManager;
import 行为型模式._04_Responsibility.责任链群.GroupLeader;
import 行为型模式._04_Responsibility.责任链群.Manager;

/**
 * @ClassName Main
 * @Description 演示责任链模式
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Main {
    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("小明",9,"身体不适");

        //创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);


        //小明提交请假申请
        groupLeader.submit(leave);
    }
}
