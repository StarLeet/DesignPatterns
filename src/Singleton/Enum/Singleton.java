package Singleton.Enum;

public enum Singleton { //枚举类因为底层构建关系是线程安全的,且不存在任何问题
    EARTH("银河系",10000),
    //MOON("银河系",100)     //当枚举类被加载时,所有的成员都会被实例化,调用构造函数
    ;


    private final String location;
    private final int size;

    Singleton(String location, int size) {
        this.location = location;
        this.size = size;
        System.out.println("地球只有一个");
    }
}
