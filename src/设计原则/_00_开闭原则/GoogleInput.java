package 设计原则._00_开闭原则;

import 设计原则._00_开闭原则.皮肤包.AbstractSkin;
import 设计原则._00_开闭原则.皮肤包.DefaultSkin;

public class GoogleInput {  //谷歌输入法
    private AbstractSkin skin = new DefaultSkin();  //谷歌默认皮肤

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
