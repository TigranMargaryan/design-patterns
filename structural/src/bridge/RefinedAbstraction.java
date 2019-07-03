package bridge;

public class RefinedAbstraction extends Abstraction {

    public RefinedAbstraction(Implementor implementor){
        super(implementor);
    }

    @Override
    String operation() {
        return this.implementor.implementation();
    }
}
