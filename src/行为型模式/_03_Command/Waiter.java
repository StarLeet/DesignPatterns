package 行为型模式._03_Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Waiter
 * @Description 服务员类
 * @Author StarLee
 * @Date 2021/11/14
 */

public class Waiter {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command cmd) {
        //将cmd对象存储到list集合中
        commands.add(cmd);
    }

    //发起命令功能  喊 订单来了
    public void orderUp() {
        System.out.println("美女服务员：大厨，新订单来了。。。。");
        //遍历list集合
        for (Command command : commands) {
            if(command != null) {
                command.execute();
            }
        }
    }
}
