package prototype;

public abstract class Prototype implements Cloneable{

    abstract Prototype copyMe() throws CloneNotSupportedException;
}
