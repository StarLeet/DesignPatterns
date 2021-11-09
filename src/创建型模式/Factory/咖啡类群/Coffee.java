package 创建型模式.Factory.咖啡类群;

public abstract class Coffee {
    private String country;  //咖啡来源国

    public abstract void addMilk();
    public abstract void addSugar();

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
