package 行为型模式._09_Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Home
 * @Description 对象结构类
 * @Author StarLee
 * @Date 2021/11/15
 */

public class Home {
    //声明一个集合对象，用来存储元素对象
    private List<Animal> nodeList = new ArrayList<Animal>();

    //添加元素功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        //遍历集合，获取每一个元素，让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
