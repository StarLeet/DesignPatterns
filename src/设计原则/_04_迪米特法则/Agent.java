package 设计原则._04_迪米特法则;

/**
 * @ClassName Agent
 * @Description 经纪人类   迪米特法则的关键类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    /**
     * 迪米特法则: 只和你的直接”朋友“交谈，不跟“陌生人”说话
     * 1. 出现为成员变量、方法参数、方法返回值中的类为 直接朋友
     * 2. 局部变量、临时变量则不是 直接的朋友
     * 3. 我们要求陌生的类不要作为局部变量出现在类中
     * */
    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    //和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }

    //和媒体公司洽谈的方法
    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }
}
