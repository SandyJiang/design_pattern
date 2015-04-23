package js.com.decorator;

/**
 * Created by Administrator on 2015/4/22.
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(){

    }
    public ConcreteDecoratorA(Component component){
        super.component = component;
    }
    @Override
    public void opration(){
        System.out.println("DecoratorA invoked!");
        super.opration();
    }
}
