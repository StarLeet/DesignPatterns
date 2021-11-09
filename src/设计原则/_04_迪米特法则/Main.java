package 设计原则._04_迪米特法则;

/**
 * @ClassName Main
 * @Description 测试类
 * @Author StarLee
 * @Date 2021/11/8
 */

public class Main {
    public static void main(String[] args) {
        //创建经纪人类
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("牛马");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("魑魅");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("地府");
        agent.setCompany(company);

        agent.meeting();//和粉丝见面
        agent.business();//和媒体公司洽谈业务
    }
}
