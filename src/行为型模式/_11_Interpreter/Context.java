package 行为型模式._11_Interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Context
 * @Description 环境角色类
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Context {
    //定义一个map集合，用来存储变量及对应的值
    private Map<Variable,Integer> map = new HashMap<Variable, Integer>();

    //添加变量的功能
    public void assign(Variable var, Integer value) {
        map.put(var,value);
    }

    //根据变量获取对应的值
    public int getValue(Variable var) {
        return map.get(var);
    }
}
