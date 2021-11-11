package 创建型模式._03_Prototype.深克隆;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName Main
 * @Description 演示原型模式的深克隆,通过将对象写入txt文本中
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Main {
    public static void main(String[] args) throws Exception{
        IdCard c1 = new IdCard();
        Student stu = new Student("张三", 102444);
        c1.setStu(stu);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Codefield\\java\\" +
                "DesignPatterns\\src\\创建型模式\\_03_Prototype\\深克隆\\ObjectMessage.txt"));
        //将c1对象写出到文件中
        oos.writeObject(c1);
        oos.close();

        //创建对象出入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Codefield\\java\\" +
                "DesignPatterns\\src\\创建型模式\\_03_Prototype\\深克隆\\ObjectMessage.txt"));
        //读取对象
        IdCard c2 = (IdCard) ois.readObject();
        //获取c2奖状所属学生对象
        Student stu1 = c2.getStu();
        stu1.setName("李四");

        //判断stu对象和stu1对象是否是同一个对象
        System.out.println("stu和stu1是同一个对象吗？" + (stu == stu1));

        c1.show();
        c2.show();
    }
}
