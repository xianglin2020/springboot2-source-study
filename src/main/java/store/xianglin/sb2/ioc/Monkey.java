package store.xianglin.sb2.ioc;

public class Monkey extends Animal {
    private String property;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String getName() {
        return "monkey";
    }
}
