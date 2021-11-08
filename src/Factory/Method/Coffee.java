package Factory.Method;

public abstract class Coffee {
    private String country;  //咖啡来源国

    abstract void addMilk();
    abstract void addSugar();

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
