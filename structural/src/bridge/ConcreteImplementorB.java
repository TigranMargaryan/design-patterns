package bridge;

public class ConcreteImplementorB  implements Implementor {

    @Override
    public String implementation() {
        return this.getClass().getName();
    }
}
