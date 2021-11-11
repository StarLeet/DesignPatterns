package 创建型模式._04_builder.建造者扩展;

/**
 * @ClassName Phone
 * @Description ToDo
 * @Author StarLee
 * @Date 2021/11/10
 */

public class Phone {
    private final String cpu;
    private final String screen;
    private final String memory;

    private Phone(Builder builder) {
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;

        public Builder() {}

        public Builder setCpu(String val) {
            cpu = val;
            return this;
        }
        public Builder setScreen(String val) {
            screen = val;
            return this;
        }
        public Builder setMemory(String val) {
            memory = val;
            return this;
        }
        public Phone build() {
            return new Phone(this);
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }
}
