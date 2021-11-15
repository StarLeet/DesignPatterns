package 行为型模式._04_Responsibility;

/**
 * @ClassName Handler
 * @Description 抽象处理者类
 * @Author StarLee
 * @Date 2021/11/14
 */

public abstract class Handler {
    protected static final int NUM_ONE = 1;
    protected static final int NUM_THREE = 3;
    protected static final int NUM_SEVEN = 7;
    protected static boolean flag = false;

    //该领导处理的请求天数区间
    private int numStart;
    private int numEnd;

    //声明后续者（声明上级领导）
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    //设置上级领导对象
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    //各级领导处理请求条的方法
    protected abstract void handleLeave(LeaveRequest leave);

    //提交请求条
    public final void submit(LeaveRequest leave) {
        if (!flag){
            System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
            flag = true;
        }
        //该领导进行审批
        if (leave.getNum() <= this.numEnd){
        this.handleLeave(leave);
        }else if(this.nextHandler != null ) {
            System.out.println(this.getName() + "权限不足,无法审批,提交上级");
            //提交给上级领导进行审批
            this.nextHandler.submit(leave);
        }else {
            System.out.println(this.getName() +  ": 回家吧,别来了");
        }
    }

    public abstract String getName();
}
