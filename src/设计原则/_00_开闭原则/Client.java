package 设计原则._00_开闭原则;

import 设计原则._00_开闭原则.皮肤包.CloudSkin;

public class Client {  //客户端
    public static void main(String[] args) {
        GoogleInput googleInput = new GoogleInput();   //客户端安装谷歌输入法
        googleInput.display();      //谷歌输入法展示默认皮肤
        googleInput.setSkin(new CloudSkin());   //客户自行修改皮肤
        googleInput.display();      //谷歌输入法切换到白云皮肤

        /**
         *  这里就符合了开闭原则
         *  1. 对修改关闭,用户不能修改已有的皮肤,只能切换皮肤
         *  2. 对扩展开放,用户如果还想要其他皮肤,可以获取新的皮肤包,然后切换皮肤就可以了
         */
    }
}
