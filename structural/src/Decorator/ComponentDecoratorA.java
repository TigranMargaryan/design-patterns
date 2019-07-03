package Decorator;

public class ComponentDecoratorA extends Decorator {

    private boolean state;
    @Override
    public void operation() {
        state = true;
        this.component.operation();
    }

    public boolean isState(){
        return state;
    }
}
