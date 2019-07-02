package adapter;

public class Adapter extends Adaptee implements Target {


    @Override
    public String request() {
        return this.specialRequest();
    }
}
