package 创建型模式._04_builder.建造者扩展;

/**
 * @ClassName Main
 * @Description 建造者模式的应用
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    public static void main(String[] args) {
        //当方法参数很多时,普通的方法设计会导致参数列表很长,而且顺序容易混淆
        Phone phone = new Phone.Builder()
                .setCpu("intel")    //线性调用,自己决定顺序,清晰明了
                .setMemory("金士顿")
                .setScreen("三星")
                .build();
        System.out.println(phone);
    }
}
