package 行为型模式._11_Interpreter;

/**
 * @ClassName AbstractExpression
 * @Description 抽象表达式类
 * @Author StarLee
 * @Date 2021/11/15
 */

public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
