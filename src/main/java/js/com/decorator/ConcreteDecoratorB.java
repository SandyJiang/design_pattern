package js.com.decorator;

/**
 * Created by Administrator on 2015/4/22.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(){

    }
    public ConcreteDecoratorB(Component component){
        super.component = component;
    }
    @Override
    public void opration(){
        System.out.println("DecoratorB invoked!");
        super.opration();
    }
}
