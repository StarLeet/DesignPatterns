package Tools;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName CountTime
 * @Description 计算指定任务运行时间的封装类
 * @Author StarLee
 * @Date 2021/11/10
 */

public class CountTime {
    private static final SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

    public interface Task {  //用于实现匿名内部类
        void execute();
    }

    public static void test(String title, Task task) {
        if (task == null) return;
        title = (title == null) ? "" : ("【" + title + "】");
        System.out.println(title);
        System.out.println("开始：" + fmt.format(new Date()));
        long begin = System.currentTimeMillis();
        task.execute();
        long end = System.currentTimeMillis();
        System.out.println("结束：" + fmt.format(new Date()));
        double delta = (end - begin) / 1000.0;
        System.out.println("耗时：" + delta + "秒");
        System.out.println("-------------------------------------");
    }
}
