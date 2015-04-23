package js.com.decorator;

/**
 * Created by Administrator on 2015/4/22.
 */
public class Decorator implements Component {
    protected  Component component;
    public Decorator(){

    }
    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void opration(){
        if(component != null){
            component.opration();
        }
    }
}
