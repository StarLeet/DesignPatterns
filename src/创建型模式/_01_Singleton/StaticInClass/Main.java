package 创建型模式._01_Singleton.StaticInClass;

public class Main {
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance().hashCode() == Singleton.getInstance().hashCode());
    }
}
